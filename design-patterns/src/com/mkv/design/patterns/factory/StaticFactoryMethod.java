/*	Static Factory Method
 * 
 * 	A class can provide a public static factory method, 
 * 	which is simply a static method that returns an instance 
 * 	of the class.
 * 
 * This code shows 2 ways to create an instance of MyClass:
 * 1. A static factory method getInstance() inside MyClass
 * 2. A constructor of MyClass
 * 
 * Example from Java API
 * - Logging frameworks: slf4j, logback and log4j use an abstract class, LoggerFactory. 
 * If a developer wants to write logs, he needs to get an instance of Logger from the 
 * static method getLogger() of LoggerFactory.
*/

package com.mkv.design.patterns.factory;

public class StaticFactoryMethod {

	public static void main(String[] args) {
		MyClass myclass1 = new MyClass(1, 2);
		System.out.println(myclass1);
		
		MyClass myclass2 = MyClass.getInstance(3, 4);
		System.out.println(myclass2);

	}

}

class MyClass{
	int a;
	int b;
	
	public MyClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static MyClass getInstance(int a, int b){
		return new MyClass(a, b);
	}
	
}
