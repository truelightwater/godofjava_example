package f.switchcase;

import e.network.DatagramServerSample;

public class JDK7Switch {
  public static void main(String[] args) {
    JDK7Switch switchSample = new JDK7Switch();
    // System.out.println(switchSample.salaryIncreaseAmount(3));
    System.out.println(switchSample.salaryIncreaseAmount("Engineer"));
  }

  public double salaryIncreaseAmount(String employeeLevel) {
    switch(employeeLevel) {
      case "CEO" : // CEO
        return 10.0;
      case "Manager" : // Manager
        return 15.0;
      case "Engineer" : // Engineer
        return 100.0;
      case "Designer" : // Designer, Planner
        return 20.0;
    }
    return 0.0;
  }
}
