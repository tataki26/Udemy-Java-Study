package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String value1, String value2)
	{
		// Ascending Order
		return Integer.compare(value1.length(), value2.length());
	}
	
}

public class QueueRunner
{
	
	public static void main(String[] args)
	{
		/*
		Queue<String> queue = new PriorityQueue<>();
		
		queue.addAll(Arrays.asList("Zebra","Monkey","Cat"));
		
		// 알파벳 순서대로 정렬
		System.out.println(queue.poll()); // Cat
		System.out.println(queue.poll()); // Monkey
		System.out.println(queue.poll()); // Zebra
		 */
		
		// 문자열 길이대로 정렬(임의의 순서)
		Queue<String> queue = new PriorityQueue<>(
				new StringLengthComparator());
		
		queue.addAll(Arrays.asList("Zebra","Monkey","Cat"));
		
		// 알파벳 순서대로 정렬
		System.out.println(queue.poll()); // Cat
		System.out.println(queue.poll()); // Monkey
		System.out.println(queue.poll()); // Zebra
		
	}

}
