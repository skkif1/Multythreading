
public class SecondThread implements Runnable {

    NotSafeClass test2Object;

    public SecondThread(NotSafeClass test2Object) {
        this.test2Object = test2Object;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {


            System.out.println(test2Object.getI());


        }
    }
}
