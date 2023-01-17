package f.lambda;


public interface runCommonThread {

  private void runCommonThread() {

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName());
      }
    };
    new Thread(runnable).start();
  }
}
