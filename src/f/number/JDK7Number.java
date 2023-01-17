package f.number;

public class JDK7Number {
  public static void main(String[] args) {
    JDK7Number number = new JDK7Number();
//    number.jdk6();
//    number.jdk7();
    number.jdkUnderscore();
  }

  public void jdk6() {
    int decVal = 1106;
    int octVal = 02122;
    int hexVal = 0x452;

    System.out.println(decVal);
    System.out.println(octVal);
    System.out.println(hexVal);
  }

  public void jdk7() {
    int binaryVal = 0b10001010010;
    System.out.println(binaryVal);
  }

  public void jdkUnderscore() {
    int binaryVal = 0b100_0101_0010;
    int million = 1_000_000;
    System.out.println(binaryVal);
    System.out.println(million);
  }
}
