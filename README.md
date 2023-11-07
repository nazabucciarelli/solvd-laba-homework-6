# 4th Homework of Java Test Automation Course - Solvd Laba
This repository stores the 4rd homework given by our mentor in the Java Test 
Automation Course at Solvd Laba. It consists in a modification of the last 
homework (3rd), adding 5 interfaces to the existing hierarchy of classes, 
applying polymorphism with an interface and abstract class, and making use 
of 'final' keyword in variables, methods and classes and the 'static' 
keyword in its default static block, methods and variables.

## Explanation

To accomplish the requirements of the homework, I've created 5 interfaces
to use in Animal and Person abstract classes, so their child classes
like Bird for Animal or Employee for Person must implement a behavior 
for each interface. The polymorphism concept with abstract class was 
achieved by declaring a Person[] array and inserting in it Employees and
Customers, with interfaces it was achieved by declaring an ISleep[] array 
and inserting in it instances of child classes from Animal and Person.
Then, I've used the 'final' keyword in the Country class, so it cannot 
be extended, in a field of Zoo named CUSTOMERS_CAPACITY, so it cannot be
changed, and in some methods of Person abstract class, so they cannot be
overridden. Finally, I've created a static block in Zoo class, that means
that it will be executed once, when the class be called for the first time,
a static variable in Animal class to know the amount of instances of it and 
a static method to get that field.

## Technologies

- Java

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
