package com.udemyjava.tips.nestedclass;

// only inside package
class DefaultClass {
	
}

public class NestedClassRunner
{
	int i;
	
	// nested class
	// non-static nested class
	class InnerClass {
		public void method() {
			i = 5;
		}
	}

	// nested class
	// with static keyword
	static class StaticNestedClass {
		public void method() {
			// error - not alowed
			// i = 5;
		}
	}
	
	public static void main(String[] args)
	{
		// no need the instance of NestedClassRunner
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		
		// need the instance of NestedClassRunner(enclosing class)
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();

	}

}
