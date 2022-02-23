# IBM-1
FirstBatch

Computer =  s/w + h/w
platform =   OS + MicroProcessor
	p1 	= Windows + intel
	p2  = Linux + intel
	
On Windows:
-------------
hello.c --Compile--> hello.exe --Run--> It will execute

On Linux:
-------------
hello.c --Compile--> hello.exe --Run--> It will execute

#include<stdio.h>
void main()
{
	printf("Hello Bro");
}

In case of C/C++ main() is called by OS.

Thats why C/C++ is platform dependent.
-----------------------------------------------
On Windows:
-------------
hello.java --Compile--> hello.class --Run--> It will execute

On Linux:
-------------
hello.java --Compile--> hello.class --Run--> It will execute


public class Hello{
	public static void main(String[] abc)
	{
		System.out.println("Hello Bro");
	}
}

The main() of Java is called by JVM(Java Virtual Machine)

Java is platform independent but highy JVM dependent.

-------------------------------------------------------------
Object Oriented Programming Language:
--------------------------------------
class
------
1. Class is an imaginary thing(blueprint) which describe the 
	properties and behaviours of an Object
	
2. Class is a representation of similar kind of objects.

3. Class is an user define data type.

Syntax:
----------------

<modifier> class <name> <extends> <implements>
{
	// members  either STATIC or INSTANCE
		1. variable
		2. methods
		3. *constructor
		4. initializer block
		5. inner/nested class
}

e.g.:
-------
class A{}

----------------
static members are associated with class
instance members are assocu=iated with object

=========================================================
--------------------------------------------
object: 
==========
Object is an instance of a class.

Syntax:
--------
	new <type>(<parameters>)


	Car c1 = new  Car();
	Car c2 = new  Car();
	
	Car.wc = 100; //OK
	
	c1.w = 5; //OK
	c2.h =10; //OK
	
	-------------------------
	
	Car.h =50;// Error
	
	c2.wc =200; //OK
	
	
Accessing members:
-----------------------
	
 <ClassName>.<member> // static
 <ObjRef>.<member> // instance as well as static
	
------------------------------------------
inheritance: It is a way of code reusability

IS-A relationship[inheritance]:
HAS-A relationship[aggregation/composition]
-----------------------------------

class Person{

	void eat(){----}
	void sleep(){----}

}

class Employee extends Person{
	void work
	
	Dog d;
}

-------------
class Dog{
}

-------------------------------------------
polymorphism: many + forms
================
1. Method overloading
2. Method overriding
3. Operator overloading

-------------------------------------------
encapsulation
==============
1. Wrapping of data and methods into a single unit called encapsulation.

 class Car{
	
	int h;
	int w;
	
	void move(){}
 
 }
 
2. Encapsulation says that make your data variable private and 
provide getter and setter for external use

-------------------------------------------
abstraction: Hiding of unneccessary details from the end users.
---------------


----------------Data Types------------------------

Data Types (1Byte = 8 bits)
-----------
1. Primitive
	|-Boolean
		|-boolean(NA)
	
	|-Numeric
		|-Integral
			|-Character
				|-char (2B)
			|-Integer
				|-byte (1B)
				|-short(2B)
				|-int (4B)
				|-long (8B)
		|-Floating Point
			|-float (4B)
			|-double (8B)


2. Reference Type
	a. class
	b. interface
	c. array
	d. enum
	d. annotation

-----------------------------------------------
byte -> short -> int -> long -> float -> double
		char -> int
		
-> Widening is done implicitly.
-> Narrowing requires casting.

============================================
Operators:
---------------
1. Arithmatic Operator
---------------------------
 a) +, -, *, /, %
 
 b) int a= 10;
    int b= 3;
	
	SOP(a + b); //13
	SOP(a - b); //7
	SOP(a * b); //30
	SOP(a / b); //3  OR 3.33
	SOP(a % b); //1
	
c)   a = a + b;  ==> a +=b;
	 a = a - b;  ==> a -=b; 
	 a = a * b;  ==> a *=b;
	 a = a / b;  ==> a /=b;
	 a = a % b;  ==> a %=b;

d) MAX(int, type1, type2, .....)
		byte b = 10;
		short s = 20;

		int x = b + s;// MAX(int, byte, short)
		
-----------------------------------------------------------
2. Relational Operator:
-----------------------
a) <, >, <=, >=

b) Operands : Numeric
	Result : boolean

Example:
---------------
	int x =15;
	
	boolean b = 10 < x < 20; // C.E.
			  = true < 20 ;
			  = ??
	SOP(b); // 

-----------------------------------------------------------------
3. Equality Operator:
-----------------------

a) ==, !=

b) operands : all
   result : boolean
	
Example:
---------
		int i =10;
		
		boolean b = i == 15; //false
				b = b == false; //true 
		
		Car c1= new Car();
		Car c2= new Car();
		
		boolean x = c1 == c2 ; // false
		
-------------------------------------------------------
4. String Concatenation operator ('+'):
---------------------------------------

 String s1 = "I Love ";
 String s2 = "Java";
 
 String s3 = s1 + s2;
 SOP(s3); // "I Love Java"
 
 ----------------------------
  String s = "Abc" + 101; // ==> "Abc" + "101"
  SOP(s); // "Abc101"
-------------------------------------------------------
5. Assignment operator:
------------------------	
		a) =
	b) -> Widening is done implicitly.
-> Narrowing requires casting.
	
---------------------------------------
6. Boolean logical operator :
-------------------------------
 a)  &, |, ^, !
 
 b) operands: boolean expression
	result : boolean
 
 c) a & b = a.b
    a | b = a + b
			_		_
    a ^ b = a.b + a.b
   
 
Example:
---------

10 & 20 =  ?? // Bitwise operators

true & false = ?? // Boolean Logical operator

------------------------------------------------------
  int x =15;
	
	boolean b = 10 < x  & x < 20; // OK
				(true) & (true)

	SOP(b); // true

--------------------------------------------
6. Ternary Operator:
-----------------------
   <boolExrp> ? <expr1>(T) : <expr2>(F)

	int a = 13;
		int b = 11;

		int max = a > b ? a : b;

		/*
		 * if (a > b) { max = a; } else { max = b; }
		 */
		System.out.println(max);

--------------------------------------------------
HW: Find maximum among three numbers
	a) using if-else
	b) using ternary operator

-------------------------------------------------------
JavaSE(Standard Edition) {Desktop, standalone e.g. eclipse, VScode, VLC, Notepad}
JavaEE(Enterprise Edition){Web application, FilpKart, Amazon etc..}
JavaME(Micro Edition){Mobile app, router, Car, Washing mc}

JDK(Java Development Kit)is for developer
	-> Compiler + JVM
JRE (Java Runtime Environment)is for client
	-> JVM

-------------------------------------------------------------------
Control Flow Statement:
-------------------------
if(<boolExpr>)
{
	//body
}
---
---
if(<boolExpr>)
{
	//body
}
else{
  // ----
}

-----
-----
if(<boolExpr>)
{
	//body
}
else if(<boolExpr>)
{
	//body
}
else{
  // ----
}

---------------------------------------------
In C/C++:  Every non-zero number treated as true.
-----------------
 int a =10;
 
  if(a = -15)
  {
	printf('Hi');
  }
 else
  {
	printf('Bye');
  }
---------------------
Output: Hi
===================================================
In Java:  
-----------------
 int a =10;
 
  if(a = 15)
  {
	SOP('Hi');
  }
 else
  {
	SOP('Bye');
  }

Compile time error

------------------------------------------------
Loops:
-----------
1. for loop
2. while loop
3. do-while
4. Enhance forloop / forEach (array/collection)
	for(<type> <var> : <expr>){
	}

-----------------------------------
initialization
condition
updation

------------------------------------------
1. For Loop:
==============

 for(<initialization> ; <condition> ; <updation>)
 {
	//Body
 }

-----------------------------------------------------------------
2. While Loop:
==============

   <initialization> 
   ----
   ---
 while( <condition>)
 {
	//Body
	
	  <updation>
 }
 -------------------------------------------------------------
 3. Do-While Loop:
==============
   <initialization> 
   ----
   ---
   
 do 
  {
	//Body	
	 <updation>
 }
 while( <condition>);
 
--------------------------------------------------
switch statement:
-----------------------
type of x ?
-------------
Till Java4: byte, short, int, char
In Java5 : enum
In java7 : String, Wrapper classes

	switch(x)
	{
		case <label1>:
						---
						---
						---
		case <label2>:
						---
						---
						---
	    case <label3>:
						---
						---
						---
		default:
						---
						---
						---
	}

------------------------------------------
continue;
break;

LAB:
-------------
1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
°C = (°F - 32) × 5/9
------------------------------------------------------------------

2. Write a Java program that reads a number in inches, converts it to meters.  
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
------------------------------------------------------------------

3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.  

Test Data
Input an integer between 0 and 1000: 565w
Expected Output :
The sum of all digits in 565 is 16
------------------------------------------------------------------
4. Write a Java program to convert minutes into a number of years and days.  

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
4. Write a Java program to convert minutes into a number of years and days.  

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days

------------------------------------------------------------------
5. Write a Java program that prints the current time in GMT.  

Test Data
Input the time zone offset to GMT: 256
Expected Output:
Current time is 23:40:24
------------------------------------------------------------------

6. Write a Java program to compute body mass index (BMI).  

Test Data (US units: BMI = (weight (lb) ÷ height2 (in)) * 703)
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721

------------------------------------------------------------------

7. Write a Java program to takes the user for a distance (in meters) and the time was taken
 (as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
 kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).  

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804

------------------------------------------------------------------

8. Write a Java program that reads a number and display the square, cube, and fourth power.  

Expected Output:
Square: .2f
Cube: .2f
Fourth power: 50625.00
------------------------------------------------------------------

9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).  

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5

------------------------------------------------------------------

10. Write a Java program to break an integer into a sequence of individual digits.  

Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6

--------------------------------------------------------------------
The main():
-------------

public class Test{
	public static void main(String[] args)
	{
		// body
	}
}

1. called by JVM which is an external entity, hence declared public.
2. It can be called with the name of class directly.
		Test.main(----);
3. void means it will not return any value.
4. args is a command line arguments.

----------------------------------------------------------------------

Methods:
---------
It is a block or group of statement which can be call mutiple times from another code.

Syntax:
-------
<modifier> <returnType> <name> (<parameterList>) <throws>
	{
		//body
	}
Example:
---------
a) void foo()
	{
	}

b) int sum(int a, int b)
	{
		return a+b;
	}

Calling methods:
-----------------------
	
 <ClassName>.<method> // static
 <ObjRef>.<method> // instance as well as static

-------------------------------------------------
Method Overloading:(Compile time | early | static polymorphism)
-------------------
Within a java class, 2 or more than 2 methods having 
same name but different paramer list,called ovrloaded method, 
and this phenomina called method overloading.

If method names are same:
	1. number of parameters
	2. data type 
	3. order of parameters

void sum(int a, float b) {
		System.out.println(a + b);
	}

void sum(float a, int b) {
		System.out.println(a + b);
	}
	
Variable Arguments:
--------------------
// Var-Args
	void sum(int... a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println(sum);

	}
        obj.sum();// 0
		obj.sum(2); // 2
		obj.sum(2, 3); // 5
		obj.sum(2, 3, 4); // 9
		obj.sum(2, 3, 4, 5);
-----------------------------------------------------
Access Modifier: public, protected, default, private
Other Modifier: static, final, abstract, native, transient, 
				volatile, synchronized, strictfp

--------------------------------------------
Constructor:
-------------
1. Constructor is a special member of a class.
2. Constructor are used to construct initial state of an object.
3. It is similar to the method but not a method 
4. Rules:
	a. Same name as of the class
	b. only access modifiers are allowed
	c. no return type even void

Example:
-------------
public class Car {

	// Default Constructor
	public Car() {
		h = 5;
		w = 7;
	}

	// Parameterized constructor
	public Car(int x, int y) {
		h = x;
		w = y;
	}

	int h;
	int w;

	void display() {
		System.out.println(h + " and " + w);
	}

}

---------------------------------------------------------------
Access Modifier:
=================
public: Access from every where
protected: 
		a) Within the same package.
		b) Outside the package through inheritance.
default: Within the same package.
private: Only within the class.

*)See Code example in Eclipse Project
---------------------------------------------------------------
Package:
---------
It is an encapsulation mechanism to group related classes and iterfaces.

HMS
 |-hospital
	|- A.java, B.java, C.java, D.java, E.java, F.java .....
	
HMS
 |-hospital
	|- A.java, B.java	
	|-doctors
		|-cardio
			|- C.java
		|-ent
			|-D.java
	|-patient
		|-indoor
			|E.java, F.java
		|-outdoor
	|-staff
		|
	
----------------------------
package test;

import p1.A; // only class A from package p1

import p3.*; // all public c;lass from package p3;

public class Main {

	public static void main(String[] args) {

		A a1 = new A();

		p2.B b1 = new p2.B(); // fullyQualifiedTypeName

		C c1 = new C();
		D d1 = new D();
		
	//	X x1= new  X(); // Error

	}
}

-------------------------------------------------------------------
Wrapper Classes:
-----------------
boolean -> Boolean
char    -> Character

----------------
byte    -> Byte
short   -> Short
int     -> Integer
long    -> Long

float   -> Float
double  -> Double
------------------
void	-> Void
	
-------------------------------------------------------------------
UseCase-1: minimum and maximum values for numeric data types
------------------------------------------------------------------
  XXX.MIN_VALUE  and XXX.MAX_VALUE

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);		
	
UseCase-2: XXX.parseXXX(String)
------------------------------------------------------------------
		int x = 10;
		// String s = x + ""; OR
		String s = String.valueOf(x);
		System.out.println(s);

		System.out.println("---------------------------");

		// String to Numeric Conversion

		String s1 = "101";

		int y = Integer.parseInt(s1);
		System.out.println("y= " + y);

		float z = Float.parseFloat(s1);
		System.out.println("z= " + z);

		String s2 = "Abc";
		int i = Integer.parseInt(s2);
		System.out.println(i);// Exception in thread "main" java.lang.NumberFormatException: For input string:
								// "Abc"
								
UseCase-3 Used in Generics and Collection Framework
------------------------------------------------------------------
1. Array is a linear Data Structure.
2. Array can cantains similar kind of data|elements|objects
3. Arrays are objects in Java.
4. Every array has an instance field named length which contains the size of array.
6. Array elements are accessed by using index and index starts from 0.
7. If we use an invalid index, we will get an exception AIOBE.

Syntax:
--------
a) <type>[] <var> = new <type>[<size>];

b) <type>[] <var> = {<values>};

--------------------------------------
	int[] arr = new int[3];// valid index 0,1,2
		arr[0] = 13;
		arr[1] = 99;
		arr[2] = 16;

		System.out.println(arr.length); //3
		
		System.out.println(arr[1]); //99
		System.out.println(arr[-1]); // AIOBE
		
-----------------------------------------------------  
int[] brr = {13, 99, 16};// valid index 0,1,2
	
How to access elements from an array:
--------------------------------------
int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("----------Accessing elements using for loop------------");

		for (int i = arr.length - 1; i >= 0; i--) {

			int x = arr[i];
			System.out.println(x);
		}

		System.out.println("----------Accessing elements using forEach loop------------");

		for (int x : arr) {
			System.out.println(x);
		}

-------------------------------------------------
Command Line Arguments:
------------------------

public class Test {

	public static void main(String[] args) {	

		System.out.println("Hello");	

	}

}

Compilation > javac Test.java
Execution   > java Test
Execution   > java Test 10 20 shadab
						-------------
						command line arguments => { "10", "20","shadab"} 
						                      main( --------------------);

==================================================================================
Inheritance:
------------
1. It is a way of code reusability.
2. Classes support single inheritance in Java
3. A class can use extends keywords to represent its parent.

4. Method Overiding:(Runtime | late | dynamic polymorphism)
-----------------------------------------------------------

class A{
	void foo()
	{
		System.out.println("Hello from A");
	}
}

class B extends A{
	void foo()
	{
		System.out.println("Hello from B");
	}
}

-------------------------------------------------------------------------
       A a1 = new A();
		a1.f1(); // f1() from class A
		a1.f2(); // "f2() from class A"
		a1.f3(); // f3() from class A
		// a1.f4(); //ERROR-> f4() not found in class A

		System.out.println("============================================");

		B b1 = new B();
		b1.f1(); // f1() from class B
		b1.f2(); // f2() from class B
		b1.f3(); // f3() from class A
		b1.f4(); // f4() from class B

		System.out.println("============================================");

		A x = new B(); // A super type variable can contains a reference of sub type.
		x.f1(); // f1() from class A
		x.f2(); // f2() from class B
		x.f3(); // f3() from class A
		// x.f4(); // ERROR

		System.out.println("============================================");

		// B y = new A(); // ERROR

-------------------------------------------------------------------------------------------
Abstract class: To restric instanciation of any class.
-------------------------------------------------------

abstract public class A
{
		void f1(){}
		
	abstract void f2();

}


-----------------------------------------------
Final class: final class cannot be inherited.
Final Variable: final variable cannot re-assigned
Final method: cannot overridden
-------------------------------------------

Interface:
---------------
-> Interface is an user define data type.
-> interface support multiple inheritance

abstract class A
{
	void f1(){}
	abstract void f2();
	
	int i =10;
	
	
}
-----------------------------
interface always super type.
Till Java7:
===============================
interface I
{
	                void f3();
	public abstract void f4();
	
	                    int i =10;
	public static final int j =10; // constant

}
---------------------------------------------------
class -- extends --> class
interface -- extends --> interface

class -- implements --> interface
interface -- ???? --> class // NOT POSSIBLE















1. Reverse an array.
2. Take 2 array and combined into 1 array.
3. Print sum and average of elements of the given array




Java Lab Challenges

1.	Program to count vowels and consonants in given String in Java? 
2.	Program to reverse a String in place in Java?
3.	Program to print Prime numbers from 1 to 100? 
4.	Program to find largest prime factors of a given integer in Java? 
5.	Program to reverse words in a given String in Java?
6.	Program to find all prime factors of a number in Java? 
7.	Program to generate prime numbers up to 100.
8.	Program to remove duplicate characters from String in Java?
9.	Program to check if a year is a leap year in Java? 
10.	Program to find the square root of a number without using a library function in Java? 
11.	Program to remove duplicate elements from the array in Java?
12.	Program to check if given number is prime in Java?
13.	Program to check if a number is binary in Java?
14.	Program to calculate Area of Triangle in Java?
15.	Program to print Fibonacci series in Java?
16.	Program to calculate the square root of a given number in Java?
17.	Program to find the highest occurring word from a given file in Java?
18.	Program to check if given String is palindrome or not in Java?
19.	Program to find all permutations of a given String in Java? 
20.	Program to calculate the sum of all elements of an array in Java?
21.	Program to reverse an array in place in Java?
22.	Program to find if given Integer is Palindrome in Java? 
23.	Program to find frequency of every digit in a number?
24.	Program to find frequency of every alphabet in a String?
25.	Program on Decimal to Hexadecimal Number Conversion?
26.	Program on Decimal to Octal Number Conversion?
27.	Program on Decimal to Binary Number Conversion?
28.	Program to find Shortest and the Longest word in a Sentence?
29.	Program for displaying the Denominations of an Amount?
30.	Program to find the LCM of two numbers?
31.	Printing the initials of a Name or First letters of each word of a Sentence?
32.	Swapping two numbers without using third variable?
33.	Program to check if two given Strings Are Anagram in Java? 

An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.

 







