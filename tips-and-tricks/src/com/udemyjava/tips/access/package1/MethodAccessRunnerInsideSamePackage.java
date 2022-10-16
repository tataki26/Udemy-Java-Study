package com.udemyjava.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage
{

	public static void main(String[] args)
	{
		ExampleClass exampleClass = new ExampleClass();
		
		// invalid - only in same class
		// exampleClass.privateMethod();
		
		// valid - same package
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();

	}

}
