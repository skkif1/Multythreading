import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NotSafeClass {
   public static long i = 0;

   static Lock lock = new ReentrantLock();

     void  incrementI() throws InterruptedException {
synchronized (this){


    for (int j = 0; j < 100000; j++) {

            i = i + 1;
        System.out.println("Incrementing is ended" + Thread.currentThread().getName());
    }



}
     }




    long getI(){

        return i;
    }

}
