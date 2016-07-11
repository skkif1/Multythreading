package WaitNotify;

public class Main {



    public static void main(String[] args) {
        DataManager test = new DataManager();
        Thread prepear = new Thread(new DataThreadPrepear(test));
        Thread sending = new Thread(new DataThreadSending(test));


        sending.start();
        prepear.start();






    }


}
