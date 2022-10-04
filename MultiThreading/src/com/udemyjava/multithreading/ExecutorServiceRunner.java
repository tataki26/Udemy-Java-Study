package com.udemyjava.multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread
{
	private int number;
	
	public Task(int number) {
		this.number = number;
	}
	
	public void run() // signature
	{
		System.out.println("\nTask" + number + " Started");
		
		for(int i=number*100;i<=number*100+99;i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nTask" + number + " Done");
	}
	
}


public class ExecutorServiceRunner
{

	public static void main(String[] args)
	{
		// 한 번에 하나의 Thread를 실행하는 기능 제공
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		
		executorService.shutdown();

	}

}
