package WaitNotify;

public class DataThreadPrepear implements Runnable {

    private DataManager dataManager = new DataManager();


    public DataThreadPrepear(DataManager dataManager) {
        this.dataManager = dataManager;
    }


    @Override
    public void run() {
        dataManager.prepearData();
    }
}
