# String Calculator – TDD Assessment (Incubyte)

This project is a part of my submission for the **Incubyte Software Craftsperson Assessment 2025**. The task was to implement the classic **String Calculator Kata** using **Test-Driven Development (TDD)** in Java.

---

## Objective

The goal was to create a method:

java
int add(String numbers)
----------------------------------------------

Features Implemented:
I carefully followed the incremental steps and implemented the following features:

Return 0 for an empty string
Return the number itself if only one number is provided
Return the sum for two comma-separated numbers
Support any amount of numbers
Allow newline (\n) as a valid delimiter along with commas
Support custom delimiters using //[delimiter]\n[numbers...] format
Throw an exception for negative numbers, listing all of them in the message
Ignore numbers greater than 1000 while summing
Handle custom delimiters of any length like "//[***]\n1***2***3"
Support multiple custom delimiters like "//[*][%]\n1*2%3"

--------------------------------------------------------------

All of the above features were implemented gradually using TDD principles — writing a failing test first, then implementing the logic, and refactoring.

I have written JUnit 5 test cases to validate all the functionalities. Each important behavior is tested through the following methods:

returnZeroWhenInputIsEmpty()
returnNumberWhenOnlyOneNumberIsGiven()
returnSumWhenTwoCommaSeparatedNumbersAreGiven()
returnSumWhenNewLineIsUsedAsSeparatorAlongWithComma()
returnSumWhenCustomDelimiterIsProvided()
throwExceptionWhenNegativeNumbersAreProvided()
ignoreNumbersGreaterThanThousand()
supportDelimiterOfAnyLength()
supportMultipleDelimiters()

All test cases pass successfully. This confirms the implementation meets the expected requirements.

---------------------------------------------------------------------
Tools & Technologies:

Java 17
JUnit 5 for testing
Maven for dependency management
IntelliJ IDEA for development
Git & GitHub for version control and hosting

---------------------------------------------------------------------

Screenshots:
![image](https://github.com/user-attachments/assets/86fc62a8-0f9f-4ffa-b4f7-f254c5d33ee0)

-----------------------------------------------------------------------

About Me:
👩‍💻 Mansi Parikh
🎓 Information Technology, Dharmsinh Desai University
📧 parikhmansi802@gmail.com
🌐 GitHub – Mansi-2004



