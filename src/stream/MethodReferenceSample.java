package stream;

import java.util.stream.Stream;

public class MethodReferenceSample {
  public static void main(String[] args) {
    MethodReferenceSample sample = new MethodReferenceSample();
    String[] stringArray = {"요다", "만두", "건빵"};
    sample.staticReference(stringArray);

  }

  public static void printResult(String value) {
    System.out.println(value);
  }

  public void staticReference(String[] stringArray) {
    Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
  }
}
