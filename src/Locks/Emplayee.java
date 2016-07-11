package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Emplayee implements Runnable{


    private Lock lock = new ReentrantLock();

    void doHisJob(){
        lock.lock();
        try {
            System.out.println("Emplyee is working");
        }finally {
            lock.unlock();
        }


}

    void fuckSecretary(){
        lock.lock();
        try {
            System.out.println("Fucking secretary......");
        }finally {
        lock.unlock();
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            fuckSecretary();
        }

    }
}
