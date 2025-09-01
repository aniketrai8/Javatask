//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;


//producer Thread
class Seller implements Runnable {
    private BlockingQueue<Integer> queue;
    //producer Constructor
    public Seller(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    //producer Method
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                queue.put(i);
                System.out.println("Producer:  "+i);
            }

        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
//Consumer Thread
class Buyer implements Runnable{

    private BlockingQueue<Integer> queue;
    //Consumer COnstructor
    public Buyer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }


    //Consumer Method
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                int value=queue.take();
                System.out.println("Consumer: " +value);
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}


public class putTake{
    public static void main(String[] args){

        BlockingQueue<Integer>queue = new ArrayBlockingQueue<>(10);

        Thread producer = new Thread(new Seller(queue));
        Thread consumer = new Thread(new Buyer(queue));

        producer.start();
        consumer.start();
    }
}


