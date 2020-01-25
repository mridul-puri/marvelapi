package com.moengage.interview.marvelapi.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.moengage.interview.marvelapi.model.Characters.Character;
import com.moengage.interview.marvelapi.model.Characters.CharacterDataContainer;
import com.moengage.interview.marvelapi.model.Characters.CharacterDataWrapper;
import com.moengage.interview.marvelapi.model.Events.Event;
import com.moengage.interview.marvelapi.model.Events.EventDataContainer;
import com.moengage.interview.marvelapi.model.Events.EventDataWrapper;
import com.moengage.interview.marvelapi.model.Series.Series;
import com.moengage.interview.marvelapi.model.Series.SeriesDataContainer;
import com.moengage.interview.marvelapi.model.Series.SeriesDataWrapper;

public class UtilityService {
	
	public ArrayList<PrintWriter> createResultFiles()
	{
		FileWriter fileWriter = null;
		ArrayList<PrintWriter> writers= new ArrayList<PrintWriter>();
		try {
			for(int i=1;i<4;i++)
			{
				fileWriter = new FileWriter("TEST-API-"+i+".json");
				writers.add(new PrintWriter(fileWriter));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return writers;
	}
	
	public CharacterDataWrapper runCharacterRequest(CloseableHttpClient httpClient,String timestamp,String apiKey,String hash)
	{
		CharacterDataWrapper characterWrapper = null;
		HttpGet characterRequest = new HttpGet("https://gateway.marvel.com:443/v1/public/characters?ts="+timestamp+"&apikey="+apiKey+"&hash="+hash);
	
		try (CloseableHttpResponse response = httpClient.execute(characterRequest)) 
		{
			HttpEntity entity = response.getEntity();
			if (entity != null) {
        	ObjectMapper mapper = new ObjectMapper();
        	mapper.registerModule(new Jdk8Module());
        	characterWrapper = mapper.readValue(response.getEntity().getContent(), CharacterDataWrapper.class);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return characterWrapper;	
	}
	
	public ArrayList<Optional<Integer>> getAllCharacters(CharacterDataWrapper wrapper,Boolean havingDescription)
	{
    	CharacterDataContainer characterContainer = wrapper.getData().orElseGet(null);
    	Optional<ArrayList<Character>> listOfCharacters = characterContainer.getResults();
		ArrayList<Optional<Integer>> listOfCharacterIDs = new ArrayList<Optional<Integer>>();
		if(havingDescription)
		{
			int count = 0;
			for(int i=0;i<listOfCharacters.get().size() && count<10;i++)
        	{
        		Optional<String> description = listOfCharacters.get().get(i).getDescription();
        		if(description.isPresent())
        			listOfCharacterIDs.add(listOfCharacters.get().get(i).getId());
        		count +=1;
        	}	
		}
		else
		{
			int count = 0;
			for(int i=0;i<listOfCharacters.get().size() && count<10;i++)
        	{
        		String description = listOfCharacters.get().get(i).getDescription().orElse(null);
        		if(description.isEmpty()) {
        			listOfCharacterIDs.add(listOfCharacters.get().get(i).getId());
        		}
        		count +=1;
        	}
		}
		return listOfCharacterIDs;	
	}
	
	public ArrayList<Optional<Integer>> getAllSeries(SeriesDataWrapper seriesWrapper)
	{
		SeriesDataContainer seriesContainer = seriesWrapper.getData().orElseGet(null);
	    Optional<ArrayList<Series>> listOfSeries = seriesContainer.getResults();
	    ArrayList<Optional<Integer>> listOfSeriesIDs = new ArrayList<Optional<Integer>>();
	    
	    for(int i=0;i<listOfSeries.get().size();i++)
	    	listOfSeriesIDs.add(listOfSeries.get().get(i).getId());
	    return listOfSeriesIDs;
	}
	
	public ArrayList<Optional<Integer>> getRandomSeriesIDs(ArrayList<Optional<Integer>> ids)
	{
		Random rand = new Random(); 
		  
        ArrayList<Optional<Integer>> newList = new ArrayList<>(); 
        for (int i=0;i<2;i++) { 
  
            int randomIndex = rand.nextInt(ids.size()); 
  
            newList.add(ids.get(randomIndex)); 

            ids.remove(randomIndex); 
        } 
        return newList; 
	}
	
	public ArrayList<Optional<Integer>> getAllEvents(EventDataWrapper wrapper)
	{
		EventDataContainer eventContainer = wrapper.getData().orElse(null);
    	Optional<ArrayList<Event>> listOfEvents = eventContainer.getResults();
		ArrayList<Optional<Integer>> listOfEventIDs = new ArrayList<Optional<Integer>>();
		for(int i=0;i<listOfEvents.get().size();i++)
		{
			listOfEventIDs.add(listOfEvents.get().get(i).getId());
		}
		return listOfEventIDs;
		
	}
}
