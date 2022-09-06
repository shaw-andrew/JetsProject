# JetsProject

## Description
This project was designed to reinforce concepts that were previously learned like For Loops, While Loops and Arrays while teaching new concepts such as Inheritance through Interfaces and Abstract classes as well as List functionality.

For this project I was instructed to create a JetApp that would utilize a default list of jets read in from a text file. The user can then use a menu to perform various functions such as view the fleet of jets and their info, find out which jet can fly the farthest/fastest as well as add and remove jets from the fleet which would update real-time.

## Class breakdowns
I created an abstract jet class that contained constructors for the jet. There were 3 interfaces to individualize the types of jets available. I created an airfield which contained the ArrayList of jets and performed add/remove functionality as well as reading in the initial jets. I also created the JetApp which is where my main menu and switch is contained to allow the user to interact with the various jets that are created.

## What I learned
Initially I was challenged with reading in the jets from the text menu. I had to separate the String so that the first variable would assign the interface, the parse the last 4 variables into their appropriate constructor types so the jet could be instantiated and added to the ArrayList of planes. The syntax was challenging, but talking out loud about what I wanted to accomplish ultimately helped me accomplish this goal.
I also misread my instructions and thought that the user should be prompted to select the jet interface prior to providing information when adding a new jet to the fleet. Pulling the "select jet type" into a method was challenging at first, but trial and error was effective and I was also able to complete this task as a stretch goal.

## How to run
This program was designed to run in an IDE.

## Technologies used
For this project, I utilized git and Java through the Eclipse IDE. 