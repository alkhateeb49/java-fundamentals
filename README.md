# java-fundamentals

## basics:
---
* * Pluralize word <br/>
takes in word and number and returns a string with the word pluralized with an “s” depending on the number if it is zero, or greater than one.

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

- main
- - Restaurant.java -> Restaurant class
- - Review.java -> Review class
- - Library.java -> main class


Run `./gradlew test` To test the Code.
* * Linter<br/>
checks if there are semicolons at the end of a line in js file. If your line doesn't contain "if", "else", end with a "{", "}", or if the line is empty, then you're missing a necessary semicolon in your file. You can expect to see similar to the below in the output, showing you which line is missing a necessary semicolon ,reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.
