package e.sync;

public class RunSyn {

  public static void main(String[] args) {
    RunSyn runSyn = new RunSyn();
    runSyn.runCommonCalculate();
  }

  public void runCommonCalculate() {
    CommonCalculate calc = new CommonCalculate();
    ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
    ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
      System.out.println("Final value is " +calc.getAmount());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
