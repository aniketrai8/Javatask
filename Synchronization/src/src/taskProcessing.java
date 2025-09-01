import java.util.concurrent.*;


public class taskProcessing {
    public static void main(String [] args) throws Exception{
        ExecutorService exe = Executors.newFixedThreadPool(5);

        Callable<String> obj1 = ()->{
            Thread.sleep(500);
            return "Your Calendar is set";

        };

        Callable<String> obj2 = ()->{
                Thread.sleep(700);
        return "Your calls are Scheduled " +Thread.currentThread().getName();
    };
        Callable<String> obj3 = () ->{
        Thread.sleep(200);
        return "Your Cab has Arrived " + Thread.currentThread().getName();
        };

        Callable<String> obj4 =()->{
            Thread.sleep(300);
            return "Email Prepared";
        };

        Future<String> res1 = exe.submit(obj1);
        Future<String> res2 = exe.submit(obj2);
        Future<String> res3 = exe.submit(obj3);
        Future<String> res4 = exe.submit(obj4);

        System.out.println(res1.get());
        System.out.println(res2.get());
        System.out.println(res3.get());
        System.out.println(res4.get());

        exe.shutdown();
    }

}
