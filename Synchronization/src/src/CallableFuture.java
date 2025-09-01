
import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String [] args) throws Exception{

        //Thread pool with one Thread
        ExecutorService obj = Executors.newSingleThreadExecutor();

        //Callable
        Callable<String> task= () -> {
            Thread.sleep(500);
            return "Task Completed by single Thread  " + Thread.currentThread().getName();
        };

      Future<String> ans = obj.submit(task);

      String result = ans.get();
      System.out.println(result);

        obj.shutdown();
    }
}




