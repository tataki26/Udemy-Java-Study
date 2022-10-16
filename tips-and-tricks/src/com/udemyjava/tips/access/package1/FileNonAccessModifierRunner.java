package com.udemyjava.tips.access.package1;

// with abstract class
// force to follow the order of execute
final class FinalClass{
	
}

// not able to extend final class(not allowed)
/*
class SomeClass extends FinalClss {
	
}
*/

class SomeClass {
	public void doSomething() {}
	final public void doSomethingFinal() {}
}

class ExtendingClass extends SomeClass {
	public void doSomething() {}
	// not able to override
	// public void doSomethingFinal() {}
}

public class FileNonAccessModifierRunner
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
