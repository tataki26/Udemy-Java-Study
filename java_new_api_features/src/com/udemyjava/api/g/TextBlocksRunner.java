package com.udemyjava.api.g;

public class TextBlocksRunner
{

	public static void main(String[] args)
	{
		String str = """
				Line 1
					"Line 2"
						Line 3
				Line 4""";
		
		System.out.print(str);
		
		// same line - invalid
		// String str2 = """hello, world""";
		
		String textBlock = """
				Line 1: %s
				Line 2: %s
				Line 3
				Line 4
				""".formatted("Some Value", "Some Other Value");
		
		System.out.print(textBlock);

	}

}
