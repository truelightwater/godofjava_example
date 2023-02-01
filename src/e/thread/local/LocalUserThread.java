package e.thread.local;

public class LocalUserThread extends Thread {
    public void run() {
        int value = ThreadLocalSample.generateNumber();
        System.out.println(this.getName() + " LocalUserThread value = " + value);

        OtherLogic otherLogic = new OtherLogic();
        otherLogic.printMyNumber();
        ThreadLocalSample.remove();
    }

    public static void main(String[] args) {
        LocalUserThread sample = new LocalUserThread();
        sample.start();
    }
}
