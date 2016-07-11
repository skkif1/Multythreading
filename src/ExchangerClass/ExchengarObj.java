package ExchangerClass;


import java.util.concurrent.Exchanger;

public class ExchengarObj implements Runnable {

    Exchanger exchager;
    Object obj;

    public ExchengarObj(Exchanger exchager, Object obj) {
        this.exchager = exchager;
        this.obj = obj;
    }

    @Override
    public void run() {

        try {


            Object previous = this.obj;
            this.obj = this.exchager.exchange(this.obj);

            System.err.println(Thread.currentThread().getName() + "Exchange......");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
