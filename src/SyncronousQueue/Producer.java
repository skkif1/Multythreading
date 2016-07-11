package SyncronousQueue;

import java.util.concurrent.SynchronousQueue;

public class Producer implements Runnable{

    private SynchronousQueue store;

    public Producer(SynchronousQueue store) {
        this.store = store;
    }


    @Override
    public void run() {


        try {

            store.put(1);
            System.err.println("put");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





    }
}

