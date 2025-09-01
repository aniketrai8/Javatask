class SharedResources {
    private int data;
    private boolean remData = false;

    public synchronized void produce(int value) {
        while (remData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        remData = true;
        System.out.println("Producer: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!remData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        remData = false;
        System.out.println("Consumer: " + data);
        notify();
    }
}

class Producer implements Runnable {
    private SharedResources shared;

    public Producer(SharedResources shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            shared.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResources shared;

    public Consumer(SharedResources shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            shared.consume();
        }
    }
}

public class Safety {
    public static void main(String[] args) {
        SharedResources shared = new SharedResources();

        Thread producerThread = new Thread(new Producer(shared));
        Thread consumerThread = new Thread(new Consumer(shared));

        producerThread.start();
        consumerThread.start();
    }
}
