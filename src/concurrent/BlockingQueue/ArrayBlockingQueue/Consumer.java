package concurrent.BlockingQueue.ArrayBlockingQueue;

import java.util.concurrent.*;


 class Consumer implements Runnable {
    private ArrayBlockingQueue store;

    public Consumer(ArrayBlockingQueue store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {

                System.out.println(store.take());
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
