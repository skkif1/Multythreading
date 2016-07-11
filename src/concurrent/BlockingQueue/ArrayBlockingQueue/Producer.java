package concurrent.BlockingQueue.ArrayBlockingQueue;


import java.util.concurrent.*;

 class Producer implements Runnable {
    private ArrayBlockingQueue store;

    public Producer(ArrayBlockingQueue store) {
        this.store = store;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                store.put(i);


                System.out.println("produce one....");
                System.out.flush();

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("produce 10 elements....");
    }
}
