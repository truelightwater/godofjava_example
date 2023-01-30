package c.string;

public class IndexOfSample {
  public static void main(String[] args) {
    IndexOfSample sample = new IndexOfSample();
    // sample.checkIndexOf();
    // sample.checkLastIndexOf();
    // sample.checkSubstring();
    // sample.checkSplit();
    // sample.checkTrim();
    sample.checkReplace();

  }

  public void checkIndexOf() {
    String text = "Java technology is both a programming language and a platform.";

    System.out.println(text.indexOf('a'));
    System.out.println(text.indexOf("a "));
    System.out.println(text.indexOf('a', 20));
    System.out.println(text.indexOf("a ", 20));
    System.out.println(text.indexOf('z'));
  }

  public void checkLastIndexOf() {
    String text = "Java technology is both a programming language and a platform.";

    System.out.println(text.lastIndexOf('a'));
    System.out.println(text.lastIndexOf("a "));
    System.out.println(text.lastIndexOf('a', 20));
    System.out.println(text.lastIndexOf("a ", 20));
    System.out.println(text.lastIndexOf('z'));

    System.out.println(text.charAt(61));
  }

  public void checkSubstring() {
    String text = "Java technology";
    String technology = text.substring(5);
    System.out.println(technology);

    String tech = text.substring(5,9);
    System.out.println(tech);
  }

  public void checkSplit() {
    String text = "Java technology is both a programming language and a platform.";

    String[] splitArray = text.split(" ");
    for(String temp:splitArray){
      System.out.println(temp);
    }
  }
  public void checkTrim() {
    String strings[] = new String[] {" a", " b ", "   c", "d    ", "e   f", "   "};

    for(String string:strings) {
      System.out.println("[" +string+ "]");
      System.out.println("[" +string.trim()+ "]");
      System.out.println();
    }

    String text = " a ";
    if (text != null && text.trim().length() > 0) {
      System.out.println("OK");
    }
  }

  public void checkReplace() {
    String text = "The String class represents character strings.";

    System.out.println(text.replace('s', 'z'));
    System.out.println(text);

    System.out.println(text.replace("tring", "trike"));
    System.out.println(text.replaceAll(" ", "|"));

    System.out.println(text.replaceFirst(" ", "|"));

  }

}
