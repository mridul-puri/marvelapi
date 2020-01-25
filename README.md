# marvelapi
----------------------------------------------------------------
This Application is written in Java.
----------------------------------------------------------------

Artifact Name :- 

marvelapi-1.0-jar-with-dependencies.jar
---------------------------------------

How to run :- 

Give the following command to run on default port : java -jar marvelapi-1.0-jar-with-dependencies.jar
Give the following command to run on specific port :java -Dserver.port=<PORT> -jar marvelapi-1.0-jar-with-dependencies.jar
---------------------------------------------------------------------------------------------------------------------------

OUTPUT FORMAT :-

Upon executing the jar file, three ".json" files will be created for the three Tests as follows :-

1) Get the list of all the characters which have description and get the list of series those
   characters are involved.
   
   Filename  : TEST-API-1.json
   
2) Randomly select 2 series from the above list and get the list of characters which were
   part of those events.
   
   Filename : TEST-API-2.json
   
3) Get the list of stories which does not involve a character with description.

   Filename : TEST-API-3.json
-------------------------------------------------------------------------------------------------------

ASSUMPTIONS :-

1) For TEST API 2 (Randomly select 2 series from the above list and get the list of characters which were part of those events.),

   the application will randomly select 2 series from the above list, then get the Events for those series and then get the list of 
   Characters which were part of those Events.
   
--------------------------------------------------------------------------------------------------------




