package app;

class MyThread extends Thread  {//

   DataHandler dataHandler; // add Type of variable

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }

    public void run() {  // add return type void
        dataHandler.getOutput();
    }
}