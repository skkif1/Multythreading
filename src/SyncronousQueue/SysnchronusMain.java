package SyncronousQueue;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class SysnchronusMain {


    public static void main(String[] args) throws InterruptedException {


        SynchronousQueue store = new SynchronousQueue<Integer>();

        Consumer consumer = new Consumer(store);
        Producer producer = new Producer(store);

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(producer);
        Thread.sleep(100);
        executor.execute(consumer);


        executor.shutdown();
    }
}
