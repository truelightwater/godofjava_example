package f.String;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerSample {
  public static void main(String[] args) {
    String[] stringArray = new String[]{"StudyHard", "GodOfJava", "Book"};

    StringJoinerSample sample = new StringJoinerSample();
    sample.joinStringOnlyComma(stringArray);
    sample.joinString(stringArray);
    sample.withCollector(stringArray);
  }

  public void joinStringOnlyComma(String[] stringArray) {
    StringJoiner joiner = new StringJoiner(",");
    for (String string : stringArray) {
      joiner.add(string);
    }
    System.out.println(joiner);
  }

  public void joinString(String[] stringArray) {
    StringJoiner joiner = new StringJoiner(",", "(", ")");
    for (String string : stringArray) {
      joiner.add(string);
    }
    System.out.println(joiner);
  }

  public void withCollector(String[] stringArray) {
    List<String> stringList = Arrays.asList(stringArray);
    String result = stringList.stream()
        .collect(Collectors.joining(","));

    System.out.println(result);
  }

}
