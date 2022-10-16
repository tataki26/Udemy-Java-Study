package com.udemyjava.tips.access.package1;

public class ExampleClass
{
	public void publicMethod() {}
	protected void protectedMethod() {}
	private void privateMethod() {}
	void defaultMethod() {}
	
	public static void main(String[] args) {
		
		ExampleClass exampleClass = new ExampleClass();
		
		// all valid
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();
		
	}
	
}
