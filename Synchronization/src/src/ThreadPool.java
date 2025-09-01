import java.util.concurrent.*;

public class ThreadPool{
    public static void main(String [] args) throws Exception{

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0;i<= 5;i++){
            int id =0;
            executor.submit(() -> {
                System.out.println("Running Tasks "+ id +" on " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}




