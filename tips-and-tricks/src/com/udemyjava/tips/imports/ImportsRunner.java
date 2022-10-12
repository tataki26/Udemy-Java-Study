package com.udemyjava.tips.imports;

// import java.lang.*; 
import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.System.out;
import static java.util.Collections.*;

public class ImportsRunner
{

	public static void main(String[] args)
	{
		// no need to import
		// java.lang -> default
		String str = "Imports";
		
		BigDecimal bd = null;
		
		out.println(str);
		out.println("static imports");
		
		sort(new ArrayList<String>());

	}

}
