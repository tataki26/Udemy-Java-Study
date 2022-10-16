package com.udemyjava.tips.nonaccess.package1;

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
	public void doSomethingElse(int arg, final int arg2) {
		arg = 3; // valid
		// arg2 = 4; // invalid
	}
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
		// immutable programming
		// use final keyword to all variables and arguments
		// To change value is not recommended
		int i = 5;
		i = 7; // valid
		
		final int j = 6;
		// j = 4; // invalid
		
		final int k;
		k = 3; // valid
		// k = 6; // invalid
		

	}

}
