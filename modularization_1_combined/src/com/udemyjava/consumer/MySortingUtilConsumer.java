package com.udemyjava.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.udemyjava.sorting.util.MySortingUtil;

public class MySortingUtilConsumer
{
	// logger 객체 만들기
	private static Logger logger =
			Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args)
	{
		MySortingUtil util = new MySortingUtil();
		
		List<String> sorted 
			= util.sort(List.of("Rakan", "Jaya", "Ashe", "Teemo"));
		
		logger.info(sorted.toString());
	}

}
