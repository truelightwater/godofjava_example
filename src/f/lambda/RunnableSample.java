package f.lambda;

public class RunnableSample {
  public static void main(String[] args) {
    RunnableSample sample = new RunnableSample();
    sample.runThread();

  }

  private void runThread() {
    new Thread( () -> {
      System.out.println(Thread.currentThread().getName());
    }).start();
  }

  private void runThreadSimple() {
    new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
  }
}
