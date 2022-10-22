package com.udemyjava.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.udemyjava.sorting.algorithm.BubbleSort;

public class DirectConsumer
{
	// logger 객체 만들기
	private static Logger logger =
			Logger.getLogger(DirectConsumer.class.getName());

	public static void main(String[] args)
	{
	    // Connect BubbleSort class directly
		// no problem
		BubbleSort util = new BubbleSort();
		
		List<String> sorted 
			= util.sort(List.of("Rakan", "Jaya", "Ashe", "Teemo"));
		
		logger.info(sorted.toString());
	}

}
