# Sem-8-Web-Technology-Practicals
College Semester 8 Web Technology Practicals, University of Delhi

# List of Practicals

The practical list contains programs of JavaScript, Java, JSP, JDBC and AJAX.

## JavaScript
Listed below are the javascript practicals of the course. to run simply open the files in the browser.
1. Create a student registration form. Create functions to perform to following checks:
    - a. Roll number is a 7 digit numeric value
    - b. Name should be an alphabetical value
    - c. Non-empty fields like DOB.
2. Implement a Static password protection
3. Write a javascript to sort an array using bubble sort take the number of elements and array from user.
4. Write a JS to implement stack methods (push and pop).

## Java
Listed below are the Java practical that are part of the course. To run you should simply run `javac` and then run the program. To run the second program with `Arithmetic` package make sure you're in the p2/ directory after compiling the class using javac then run `java Arithmetic.ArithmeticDemo`
1. Implement a Matrix class. Use methods for addition, subtraction, multiplication and transpose. Use `toString()` to display the matrix
2. Create a `package` 'Arithmetic' containing two classes `Rational` and `Complex`.
    - a. Rational performs arithmetic with rational nos. Use integer variables to represent the private instance variables of the class, numerator and denominator. Write a constructor method that enables an object of this class. Use `toString()` method.
    - b. Complex performs arithmetic for complex numbers. Use instance variables: real and imaginary for storing complex numbers. Simulate addition, subtraction, multiplication of complex numbers. Introduce `this` keyword.
3. Implement an `abstract` Class Stack with methods push, pop, display for two classes: `StaticStack` and `DynamicStack`. StaticStack uses one dimensional integer array to store numbers and DynamicStack uses an integer `ArrayList` to store.
4. Create a base class called `Shape`. It should containt 2 methods `getcoord()` and `showcorrd()` to accept X and Y coordinates and to display the same respectively. Create a subclass called Rect. it should also contain a method to display the length and breadth of the rectangle called `showCorrd()`. In main method, execute `showCorrd()` method of Rect class by applying the dynamic method dispatch concept.    

## JSP
Listed below are the JSP programs in the course. To run you'd need a server.
1. Write a JSP Scriptlet to print the current time and date.
2. Write a JSP scriplet to declare two integers and print their sum, difference, product and modulus.
3. Write a JSP scriptlet which inputs name of three friends from a form and prints them back with a prefix "Hello" before each name.
4. Write a JSP Scriptlet to input a number from a form and prints back the factorial
5. Write a JSP program which uses JSTL and Expression Language the greates of three.

## JDBC
To Run JDBC codes I have included the mysql connector which would be required to run JDBC codes. Also You'll find the sql file required to create the neccessary database for the program
- Compile: `javac JDBCDemo.java`
- Run: `java -cp mysql-connector-java-5.1.25.jar:. JDBCDemo`
Below are the listed programs in course.
1. Create Student and Results Database and perform the following using JDBC programs
    - a. Find total number of students
    - b. Print average marks for each subject
    - c. Find the name of student getting highest marks
    - d. Find no of students getting first, second and third division
    - e. Find subject wise toppers.
    - f. Find average marks.
    - g. Find the student getting second highest marks.

## AJAX
Below are the ajax practicals in course. to run them you'd need to run the html files on a server. APACHE etc.
1. Create an interactive multiple-choice quiz using JavaScript and AJAX.
2. Create an Ajax-enabled HTML page for accepting a user ID and password from the user and check if user ID and password are correct.

