package com.udemyjava.tips.access.package2;

import com.udemyjava.tips.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage
{

	public static void main(String[] args)
	{
		ExampleClass exampleClass = new ExampleClass();
		
		// invalid - only in same class
		// exampleClass.privateMethod();
		
		// invalid - only in same package
		// exampleClass.protectedMethod(); // child package(inheritance)
		// exampleClass.defaultMethod(); // (inheritance - invalid)
		
		// valid - different package
		exampleClass.publicMethod();
		

	}

}
