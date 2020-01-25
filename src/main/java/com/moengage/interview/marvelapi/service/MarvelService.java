package com.moengage.interview.marvelapi.service;

import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.moengage.interview.marvelapi.constants.configValues;
import com.moengage.interview.marvelapi.model.Characters.CharacterDataWrapper;
import com.moengage.interview.marvelapi.model.Events.EventDataWrapper;
import com.moengage.interview.marvelapi.model.Series.SeriesDataWrapper;
import com.moengage.interview.marvelapi.model.Stories.StoryDataWrapper;

public class MarvelService {
	 
	private static final CloseableHttpClient httpClient = HttpClients.createDefault();
	private static final configValues cval = new configValues();
	
	private static final Timestamp ts = new Timestamp(System.currentTimeMillis());
	private static final String timestamp = URLEncoder.encode(ts.toString());
	
	private static final String privateKey = cval.getPrivateKey();
	private static final String publicKey = cval.getPublicKey();
	private static final String apiKey = cval.getApiKey();
	
	private static final String hash = HashService.getMd5(ts.toString()+privateKey+publicKey);
	
	public void startTest()
	{
		UtilityService utilserv = new UtilityService();
		ArrayList<PrintWriter> writers = utilserv.createResultFiles();
		SeriesDataWrapper seriesWrapper = testAPI1(writers.get(0));
		testAPI2(writers.get(1),seriesWrapper);
		testAPI3(writers.get(2));
		for(int i=0;i<3;i++)
			writers.get(i).close();
	}
	 
	public SeriesDataWrapper testAPI1(PrintWriter writer)
	{
		SeriesDataWrapper seriesWrapper = null;
		ArrayList<Optional<Integer>> charactersWithDescr = new ArrayList<Optional<Integer>>();
		HttpEntity entity = null;
		ObjectMapper mapper = null;
		UtilityService util = new UtilityService();
		
		//GET CHARACTERS
		CharacterDataWrapper characterWrapper = util.runCharacterRequest(httpClient,timestamp,apiKey,hash); 
		charactersWithDescr = util.getAllCharacters(characterWrapper,true); 
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for(int i=0;i<charactersWithDescr.size();i++)
		{
			Boolean flag = charactersWithDescr.get(i).isPresent();
			if(flag)
				tempList.add(charactersWithDescr.get(i).get());
		}
		String characterIDs = tempList.stream().map(String::valueOf).collect(Collectors.joining(","));
		
		//GET SERIES
		HttpGet seriesRequest = new HttpGet("https://gateway.marvel.com:443/v1/public/series?characters="+characterIDs+"&ts="+timestamp+"&apikey="+apiKey+"&hash="+hash);
		
		try (CloseableHttpResponse response = httpClient.execute(seriesRequest)) 
	    {
	        entity = response.getEntity();
	        if (entity != null) {
	        	mapper = new ObjectMapper();
	        	mapper.registerModule(new Jdk8Module());
	        	seriesWrapper = mapper.readValue(response.getEntity().getContent(), SeriesDataWrapper.class);
	        	String prettyJsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(seriesWrapper);
	        	writer.println("OUTPUT FOR TEST API 1 :- ");
	        	writer.println("\n\n"+prettyJsonString);
	        }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    } 
	
		return seriesWrapper;
	}
	
	public void testAPI2(PrintWriter writer,SeriesDataWrapper seriesWrapper)
	{
		EventDataWrapper eventWrapper = null;
		CharacterDataWrapper characterWrapper = null;
		ArrayList<Optional<Integer>> eventIDs = new ArrayList<Optional<Integer>>();
		HttpEntity entity = null;
		ObjectMapper mapper = null;
		UtilityService util = new UtilityService();
		
		ArrayList<Optional<Integer>> listOfSeriesIDs = util.getAllSeries(seriesWrapper);
	    ArrayList<Optional<Integer>> randomeIDs = util.getRandomSeriesIDs(listOfSeriesIDs);
	    
	    ArrayList<Integer> tempList = new ArrayList<Integer>();
		for(int i=0;i<randomeIDs.size();i++)
		{
			Boolean flag = randomeIDs.get(i).isPresent();
			if(flag)
				tempList.add(randomeIDs.get(i).get());
		}
	    String seriesids = tempList.stream().map(String::valueOf).collect(Collectors.joining(","));
	    
	    //GET EVENTS
	    HttpGet eventRequest = new HttpGet("https://gateway.marvel.com:443/v1/public/events?series="+seriesids+"&ts="+timestamp+"&apikey="+apiKey+"&hash="+hash);
	    try (CloseableHttpResponse response = httpClient.execute(eventRequest)) 
	    {
	        entity = response.getEntity();
	        if (entity != null) {
	        	mapper = new ObjectMapper();
	        	mapper.registerModule(new Jdk8Module());
	        	eventWrapper = mapper.readValue(response.getEntity().getContent(), EventDataWrapper.class);
	        	eventIDs = util.getAllEvents(eventWrapper);
	        }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    } 
	    
	    ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		for(int i=0;i<eventIDs.size();i++)
		{
			Boolean flag = eventIDs.get(i).isPresent();
			if(flag)
				tempList2.add(eventIDs.get(i).get());
		}
		
	    String eventids = tempList2.stream().map(String::valueOf).collect(Collectors.joining(","));
	    
	    //GET CHARACTERS
	    HttpGet characterRequest = new HttpGet("https://gateway.marvel.com:443/v1/public/characters?events="+eventids+"&ts="+timestamp+"&apikey="+apiKey+"&hash="+hash);
	    try (CloseableHttpResponse response = httpClient.execute(characterRequest)) 
	    {
	        entity = response.getEntity();
	     
	        if (entity != null) {
	        	mapper = new ObjectMapper();
	        	mapper.registerModule(new Jdk8Module());
	        	characterWrapper = mapper.readValue(response.getEntity().getContent(), CharacterDataWrapper.class);
	        	String prettyJsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(characterWrapper);
	        	writer.println("\n\nOUTPUT FOR TEST API 2 :- ");
	        	writer.println("\n\n"+prettyJsonString);
	        }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    } 
	}
	
	public void testAPI3(PrintWriter writer)
	{
		StoryDataWrapper storyWrapper = null;
		HttpEntity entity = null;
		ObjectMapper mapper = null;
		UtilityService util = new UtilityService();
		
		//GET CHARACTERS
		CharacterDataWrapper characterWrapper = util.runCharacterRequest(httpClient,timestamp,apiKey,hash); 
		ArrayList<Optional<Integer>> charactersWithoutDescr = util.getAllCharacters(characterWrapper,false);
		
		ArrayList<Integer> tempList3 = new ArrayList<Integer>();
		for(int i=0;i<charactersWithoutDescr.size();i++)
		{
			Boolean flag = charactersWithoutDescr.get(i).isPresent();
			if(flag)
				tempList3.add(charactersWithoutDescr.get(i).get());
		}
		String characterids = tempList3.stream().map(String::valueOf).collect(Collectors.joining(","));
		
	    //GET STORIES
	    HttpGet storyRequest = new HttpGet("https://gateway.marvel.com:443/v1/public/stories?characters="+characterids+"&ts="+timestamp+"&apikey="+apiKey+"&hash="+hash);
	    try (CloseableHttpResponse response = httpClient.execute(storyRequest)) 
	    {
	        entity = response.getEntity();
	     
	        if (entity != null) {                
	        	mapper = new ObjectMapper();
	        	mapper.registerModule(new Jdk8Module());
	        	storyWrapper = mapper.readValue(response.getEntity().getContent(), StoryDataWrapper.class);
	        	String prettyJsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(storyWrapper);
	        	writer.println("\n\nOUTPUT FOR TEST API 3 :- ");
	        	writer.printf("\n\n"+prettyJsonString);
	        }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    } 
	}  	
}