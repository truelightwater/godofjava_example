package stream;

import java.util.Arrays;
import java.util.List;

public class mapSample {
  public static void main(String[] args) {
    mapSample sample = new mapSample();

    List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    sample.multiplyWithFor(intList);

  }

  private void multiplyWithFor(List<Integer> intList) {
    intList.stream().map(x->x*3).forEach(System.out::println);
  }

}
