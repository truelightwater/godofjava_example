package e.thread;

public class RunMultiThreads {
  public static void main(String[] args) {
    RunMultiThreads sample = new RunMultiThreads();
    sample.runMultiThread();
  }

  public void runMultiThread() {
    RunnableSample[] runnable = new RunnableSample[5];
    Thread[] thread = new Thread[5];

    for (int loop = 0; loop < 5; loop++) {
      runnable[loop] = new RunnableSample();
      thread[loop] = new Thread();

      new Thread(runnable[loop]).start();
      thread[loop].start();
    }

    System.out.println("RunMultiThreads.runMultiThread() method is ended.");
  }
}
