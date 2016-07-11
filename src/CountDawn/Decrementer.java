package CountDawn;

import java.util.concurrent.CountDownLatch;

 class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
            System.out.println("Do something");
            Thread.sleep(1000);
            this.latch.countDown();

            System.out.println("DO");
            Thread.sleep(1000);
            this.latch.countDown();

            System.out.println("Done ");
            Thread.sleep(1000);
            this.latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}