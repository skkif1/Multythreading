package LinkedBlockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueEx {


    public static void main(String[] args) {


        LinkedBlockingQueue<Integer> store = new LinkedBlockingQueue<Integer>(100000);


        Consumer consumer = new Consumer(store);
        Producer producer = new Producer(store);
        Producer producer1 = new Producer(store);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(consumer);
        executor.execute(producer);
        executor.execute(producer1);

        executor.shutdown();


    }
}
