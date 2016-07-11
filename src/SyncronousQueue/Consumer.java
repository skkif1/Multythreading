package SyncronousQueue;

import java.util.concurrent.SynchronousQueue;

 class Consumer implements Runnable{

    private SynchronousQueue store = new SynchronousQueue();

    public Consumer(SynchronousQueue store) {
        this.store = store;
    }


    @Override
    public void run() {


        try {
            store.take();
            System.err.println("take");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }







    }
 }

