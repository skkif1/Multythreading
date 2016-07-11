package ExchangerClass;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Exchanger exchanger = new Exchanger();

        ExchengarObj exchengarObj = new ExchengarObj(exchanger, "First");
        ExchengarObj exchengarObj1 = new ExchengarObj(exchanger, "Second");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.println(exchengarObj.obj);
        System.out.println(exchengarObj1.obj);

        executor.submit(exchengarObj);
        executor.submit(exchengarObj1);
        executor.shutdown();

        Thread.sleep(1000);

        System.out.println(exchengarObj.obj);
        System.out.println(exchengarObj1.obj);



    }

}
