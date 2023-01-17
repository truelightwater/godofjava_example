package f.generic;

public class GenericClass <X> {
  private X x;
  private Object o;

  public <T> GenericClass(T t) {
    this.o = t;
    System.out.println("T Type = " +t.getClass().getName());
  }

  public void setValue(X x) {
    this.x = x;
    System.out.println("X type = " +x.getClass().getName());
  }


}
