// Assignment Zip File(All data of code and Supportive Data)
//Read me file (Details wright in readme file)
//Two separate classes of assignment (Recentsongstore.java & RecentsongstoreTest.Java) 

//Coding Assignment (Problem Statement)
OVERVIEW
Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. This store must have the capability to store a list of song-user pairs, with each song linked to a user. It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.
EXAMPLE
Illustration, when 4 different songs were played by a user & Initial capacity is 3: 
Let's assume that the user has played 3 songs - S1, S2 and S3.
The playlist would look like -> S1,S2,S3
When S4 song is played -> S2,S3,S4 
When S2 song is played -> S3,S4,S2 
When S1 song is played -> S4,S2,S1

SUBMISSION GUIDELINES
Share your code via a git repo. 

EXPECTATIONS
Pick any object oriented language of your choice to solve the problem
Adhere to clean coding standards and principles. OOP is recommended (A sample list of coding conventions to refer https://www.browserstack.com/guide/coding-standards-best-practices)
Write tests to validate the logic//
