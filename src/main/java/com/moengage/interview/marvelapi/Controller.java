package com.moengage.interview.marvelapi;

import com.moengage.interview.marvelapi.service.MarvelService;

public class Controller 
{
    public static void main( String[] args )
    {
    	MarvelService marvserv = new MarvelService();
		marvserv.startTest();
    }
}
