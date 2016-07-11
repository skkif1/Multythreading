package CountDawn;


import java.util.concurrent.CountDownLatch;

 class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Waiter Released");
        for (int i = 0; i < 10; i++) {
            System.out.println("Uhooo");
        }


    }
}