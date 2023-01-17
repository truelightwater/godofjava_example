package c.enums;

public class OverTimeManager2 {
  public static void main(String[] args) {
    OverTimeValue2 value2 = OverTimeValue2.FIVE_HOUR;
    System.out.println(value2);
    System.out.println(value2.getAmount());

    OverTimeValue2 value3 = OverTimeValue2.THREE_HOUR;
    System.out.println(value2.compareTo(value3));
  }
}
