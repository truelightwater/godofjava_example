package c.exception;
import c.exception.ThrowSample;

public class throwsException {
  public static void main(String[] args) {
    throwsException sample = new throwsException();
    try {
      sample.throwsException(13);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void throwsException(int number) throws NullPointerException, Exception{
    if (number > 12) {
      throw new Exception("Number is over than 12");
    }
    System.out.println("Number is " +number);
  }
}
