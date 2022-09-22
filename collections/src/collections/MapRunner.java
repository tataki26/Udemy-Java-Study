package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner
{

	public static void main(String[] args)
	{
		String str = "This is an awesome occasion. "
				+ "This has never happened before.";
		
		// count characters
		Map<Character, Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for(char character: characters) 
		{
			// Get the character
			Integer integer = occurances.get(character);
			
			if(integer==null) 
			{
				// if it is not there, initialize to 1
				occurances.put(character,1);
			}
			else
			{
				// if it is there, we increment the count
				occurances.put(character,integer+1);
			}
			
		}
		
		System.out.println(occurances);
		
		// count words
		Map<String, Integer> strOccurances = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String word: words) 
		{
			// Get the word
			Integer integer = strOccurances.get(word);
			
			if(integer==null) 
			{
				// if it is not there, initialize to 1
				strOccurances.put(word,1);
			}
			else
			{
				// if it is there, we increment the count
				strOccurances.put(word,integer+1);
			}
			
		}
		
		System.out.println(strOccurances);

	}

}
