package Bank;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        ExecutorService executor = Executors.newSingleThreadExecutor();


        executor.execute(new Runnable() {
            @Override
            public void run() {
                long start = System.nanoTime();
                human.cleanTeath();
                human.makeBreackfest();
                human.goTOJob();
                long result = System.nanoTime() - start;
                System.out.println(result / 1000);

            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                long start = System.nanoTime();
                human.makeBreackfest();
                long result = System.nanoTime() - start;
                System.out.println(result / 1000);
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                long start = System.nanoTime();
                human.goTOJob();
                long result = System.nanoTime() - start;
                System.out.println(result / 1000);
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                long start = System.nanoTime();
                human.cleanTeath();
                long result = System.nanoTime() - start;
                System.out.println(result / 1000);

            }
        });

        System.out.println(executor.isShutdown());
        executor.shutdown();







    }
}
