package f.generic;

public class TypeInference {
  public static void main(String[] args) {
    TypeInference type = new TypeInference();
    type.makeObjects1();
    System.out.println();
    type.makeObjects2();
    System.out.println();
    type.makeObjects3();
    System.out.println();
    // type.makeObjects4();
  }

  public void makeObjects1() {
    GenericClass<Integer> generic1 = new GenericClass<>("String");
    generic1.setValue(999);
  }

  public void makeObjects2() {
    GenericClass<Integer> generic2 = new GenericClass("String");
    generic2.setValue(999);
  }

  public void makeObjects3() {
    GenericClass<Integer> generic3 = new <String> GenericClass<Integer>("String");
    generic3.setValue(999);
  }

  /*public void makeObjects4() {
    GenericClass<Integer> generic4 = new <String>GenericClass<>("String");
    generic4.setValue(999);
  }*/
}
