package concurrent.BlockingQueue.ArrayBlockingQueue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> store = new ArrayBlockingQueue<Integer>(100);


        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(producer);
        executor.submit(consumer);

        executor.shutdown();


    }

}
