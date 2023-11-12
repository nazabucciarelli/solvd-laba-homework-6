# 6th Homework of Java Test Automation Course - Solvd Laba
This repository stores the 6th homework given by our mentor in the Java Test 
Automation Course at Solvd Laba. It consists in a modification of the last 
homework (5th), adding a package named exceptions with five custom 
exceptions, handling exceptions in two ways, using try-catch with resources
and adding the log4j2 libraries in order to learn its functionality.

## Explanation

To accomplish the requirements of the homework, I've created five custom
exceptions and put them in the exceptions package in order to keep the 
order in the project. I've used these exceptions in some setter methods
from Employee and Person classes, to give them some validations and then
handle these exceptions. First, I've handled the NegativeValueException
in the setAge method of Person class using the 'throws' keyword, since it
is a checked exception. After, I've used try-catch-finally to handle the
same method, but in the Main class, since the use of 'throws' keyword 
in the signature of the main method is not a good practice. Finally,
I've replaced all the System.out.println() with the Logger methods and 
used the try-catch with resources with a Scanner.

## Technologies

- Java
- Log4j2

## Set-Up

To run this project you will need an updated version of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and, finally, run the Main.java 
file to see the program output.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
