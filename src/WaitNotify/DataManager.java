package WaitNotify;

public class DataManager {
private boolean isPrepeared;

   synchronized void prepearData(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("prepearing data.....");
        }

        isPrepeared = true;
        notify();
    }

   synchronized void sendData(){
        while(!isPrepeared){

            try {
                System.out.println("waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Sending data........");
        }

        isPrepeared = false;
    }


}