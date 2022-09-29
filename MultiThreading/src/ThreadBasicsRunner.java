class Task1 extends Thread
{
	public void run() // signature
	{
		System.out.println("\nTask1 Started");
		
		for(int i=101;i<=199;i++)
		{
			System.out.print(i+" ");
			
			if(i%10 == 0)
				System.out.print("\n");
		}
		
		System.out.println("\nTask1 Done");
	}
}

public class ThreadBasicsRunner
{
	
	public static void main(String[] args)
	{
		System.out.print("\nTask1 Kicked Off");
		
		// Task1 - 101 to 199
		Task1 task1 = new Task1();
		task1.start();
		
		System.out.print("\nTask2 Kicked Off");
		
		// Task2
		for(int i=201;i<=299;i++)
		{
			System.out.print(i+" ");
			
			if(i%10 == 0)
				System.out.print("\n");
		}
		
		System.out.println("\nTask2 Done");
		
		System.out.print("\nTask3 Kicked Off");
		
		// Task3
		for(int i=301;i<=399;i++)
		{
			System.out.print(i+" ");
			
			if(i%10 == 0)
				System.out.print("\n");
		}
		
		System.out.print("\nTask3 Done ");
		
		System.out.print("\nMain Done");

	}

}
