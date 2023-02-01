package e.thread.volat;

public class VolatileSample extends Thread {
    private double instanceVariable = 0;

    void setDouble(double value) {
        this.instanceVariable = value;
    }

    public void run() {
        while (instanceVariable == 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(instanceVariable);
        }
    }
}
