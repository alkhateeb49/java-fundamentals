# java-fundamentals

## basics:
---
* * Pluralize word <br/>
takes in word and number and returns a string with the word pluralized with an āsā depending on the number if it is zero, or greater than one.

* * Flipping Coins <br/>
accepts an integer n and flips coins until n heads are flipped in a row.

* * Clock<br/>
prints out the current time to the console, second by second.


## basiclibrary:
---
* * Rolling Dice <br/>
accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

* * Contains Duplicates <br/>
returns true or false depending on whether the array contains duplicate values.

* * Calculating Averages <br/>
accepts an array of integers and calculates and returns the average of all the values in the array.

* * Lowest value Array of Arrays <br/>
Given an array of arrays calculate the average value for each array and return the array with the lowest average.

--

* * Analyze weather data <br/>
Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

* * Tally <br/>
accepts a List of Strings representing votes and returns one string to show what got the most votes.

--

## linter:
---
File I/O

Linter checks if there are semicolons at the end of a line in js file. If your line doesn't contain "if", "else", end with a "{", "}", or if the line is empty, then you're missing a necessary semicolon in your file. You can expect to see similar to the below in the output, showing you which line is missing a necessary semicolon

## Inheritance and Interfaces
---
### Overview Of The Architecture

- - Restaurant.java -> Class that contain  a name, a number of stars betweeen 0 and 5, and a price category
- - Review.java -> should have a body, an author, and a number of stars.
- - Library.java -> main class to run the code.


Run `./gradlew test` To test the Code. and there are test cases on Test file.
---
### Inheritance, day 2
- main
- - Restaurant.java -> Class that contain  a name, a number of stars betweeen 0 and 5, and a price category
- - Review.java -> should have a body, an author, and a number of stars.
- - Library.java -> main class to run the code.
- - Shop.java -> Shop class The users want shops! Create a Shop class.
- - Theater.java -> Theater class,The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

Run `./gradlew test` To test the Code, And see test cases on teset class.


---
