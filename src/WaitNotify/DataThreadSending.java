package WaitNotify;



public class DataThreadSending implements Runnable {


    private DataManager dataManager = new DataManager();

    public DataThreadSending(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void run() {
        dataManager.sendData();
    }
}
