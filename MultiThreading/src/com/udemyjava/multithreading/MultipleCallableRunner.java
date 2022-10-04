package com.udemyjava.multithreading;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		// newFixedThreadPool의 인자에 따라 실행 속도 달라짐
		// 한 번에 실행할 수 있는 Thread의 개수
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		// task lists
		List<CallableTask> tasks = Arrays.asList(new CallableTask("Takityaki"), 
				new CallableTask("Taki"), new CallableTask("tyaki"));
		
		// invoke all: return future list
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		
		executorService.shutdown();

	}

}