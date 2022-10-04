import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 값을 반환하는 역할
class CallableTask implements Callable<String> {
	
	private String name;
	
	public CallableTask(String name){
		this.name = name;
	}

	@Override
	public String call() throws Exception
	{
		Thread.sleep(1000);
		return "\n Hello " + name;
	}
}

public class CallableRunner
{

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		// Future: Thread
		Future<String> welcomeFuture
			= executorService.submit(new CallableTask("Takityaki"));
		
		System.out.print("\n new CallableTask(\"Takityaki\") executed");
			
		// 모든 thread 실행 후, 예외 처리
		String welcomeMessage = welcomeFuture.get();
		
		System.out.print(welcomeMessage);
		System.out.print("\n Main completed");

	}

}
