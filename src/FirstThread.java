/**
 * Created by Dobre on 08.07.2016.
 */
public class FirstThread implements Runnable {


    NotSafeClass testObject;

    public FirstThread(NotSafeClass testObject) {
        this.testObject = testObject;
    }

    @Override
    public void run() {

        try {
            testObject.incrementI();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

