package LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {

    private LinkedBlockingQueue store;


    public Producer(LinkedBlockingQueue store) {
        this.store = store;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {


            try {
                store.put(i);
                System.err.println("Thread " + Thread.currentThread() + "put " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




        }
    }
}
