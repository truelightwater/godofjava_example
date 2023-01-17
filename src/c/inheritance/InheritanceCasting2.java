package c.inheritance;

public class InheritanceCasting2 {
  public static void main(String[] args) {
    InheritanceCasting2 inheritance = new InheritanceCasting2();
    inheritance.objectCast2();
  }

  public void objectCast() {
    ParentCasting parent = new ParentCasting();
    ChildCasting child = new ChildCasting();

    ParentCasting parent2 = child;
    ChildCasting child2 = (ChildCasting) parent;

  }

  public void objectCast2() {
    ChildCasting child = new ChildCasting();
    ParentCasting parent2 = child;

    ChildCasting child2 = (ChildCasting) parent2;
  }
}
