package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner
{

	public static void main(String[] args)
	{
		List<Character> characters = Arrays.asList('A','Z','A','B','Z','F');
		
		// unique - Set
		// Tree: ordered
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet "+treeSet); // [A,B,F,Z]
		// LinkedHash: insert order 
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet "+linkedHashSet); // [A,Z,B,F]
		// Hash: ordered[x], insert order[x]
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet "+hashSet); // [A,B,Z,F]
	}

}
