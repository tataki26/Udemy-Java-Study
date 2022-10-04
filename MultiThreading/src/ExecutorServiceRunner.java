import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner
{

	public static void main(String[] args)
	{
		// 한 번에 하나의 Thread를 실행하는 기능 제공
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		
		// Task3
		for(int i=301;i<=399;i++)
		{
			System.out.print(i+" ");
			
		}
		
		System.out.print("\nTask3 Done ");
		
		System.out.print("\nMain Done");
		
		executorService.shutdown();

	}

}
