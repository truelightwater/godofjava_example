package e.support;

public class RunSupportThreads {
  public static void main(String[] args) {
    RunSupportThreads sample = new RunSupportThreads();
    sample.checkThreadState1();
//    sample.checkJoin();
  }

  public void checkThreadState1() {
    SleepThread thread = new SleepThread(4000);

    try {
      System.out.println("Thread State = " +thread.getState());
      thread.start();
      System.out.println("Thread State(after start) = " +thread.getState());

      thread.sleep(2000);
      System.out.println("Thread State(after 1sec) = " + thread.getState());

      thread.join();
      thread.interrupt();
      System.out.println("Thread State(after join) = " +thread.getState());
    } catch (InterruptedException e){
      e.printStackTrace();
    }
  }

  public void checkJoin() {
    SleepThread thread = new SleepThread(2000);

    try {
      thread.start();
      thread.join(2016);
      thread.interrupt();
      System.out.println("thread state(after join)=" +thread.getState());
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
  }
}
