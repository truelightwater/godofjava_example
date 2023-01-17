package c.exception;

public class MultiCatchThreadWithNull {
  public static void main(String[] args) {
    MultiCatchThreadWithNull sample = new MultiCatchThreadWithNull();
    sample.finallySample();
  }

  public void finallySample() {
    int[] intArray = new int[5];

    try {
      intArray = null;
      System.out.println(intArray[5]);
    } /*catch (NullPointerException e) {
      System.out.println("NullPointerException occurred");
    } */ catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("ArrayIndexOutOfBoundsException occurred");
    } catch (Exception e) {
      System.out.println("Exception occurred");
    }

  }
}
