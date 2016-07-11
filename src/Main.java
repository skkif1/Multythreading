import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Dobre on 08.07.2016.
 */
public class Main
{


    public static void main(String[] args) throws InterruptedException {



        NotSafeClass testObject = new NotSafeClass();
        NotSafeClass testObject1 = new NotSafeClass();
        FirstThread thread1 = new FirstThread(testObject);
        FirstThread thread2 = new FirstThread(testObject);

        Thread test2 = new Thread(thread2);

        for (int i = 0; i < 10; i++) {
            Thread test1 = new Thread(thread1);
            test1.start();

        }

        System.out.println(testObject.getI());

        Executor executor = Executors.newSingleThreadExecutor();
        Lock lock = new ReentrantLock();
        lock.newCondition().signal();

    }

}
