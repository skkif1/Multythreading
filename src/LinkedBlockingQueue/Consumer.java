package LinkedBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Consumer implements Runnable {

    private LinkedBlockingQueue store;

    public Consumer(LinkedBlockingQueue store) {
        this.store = store;
    }


    @Override
    public void run() {

        System.out.println(store.isEmpty());

        while (true) {


            try {
                System.err.println(store.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

