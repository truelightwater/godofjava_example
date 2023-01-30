package d.string;

public class StringSample {
  public static void main(String[] args) {
    StringSample sample = new StringSample();
    // sample.convert();
    sample.convertUTF16();
  }

  public void printByteArray(byte[] array) {
    for (byte data:array){
      System.out.print(data + " ");
    }
    System.out.println();
  }

  public void convert() {
    String hangeul = "한글";

    byte[] arrays = hangeul.getBytes();
    for (byte array : arrays) {
      System.out.print(array + " ");
    }

    System.out.println();

    String korean = new String(arrays);
    System.out.println(korean);

  }

  public void convertUTF16() {
    try {
      String korean = "한글";
      byte [] array1 = korean.getBytes("UTF-16");
      printByteArray(array1);

      String korean2 = new String(array1,"UTF-16");
      System.out.println(korean2);

    } catch (Exception e){
      e.printStackTrace();
    }
  }

}
