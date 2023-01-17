package c.inheritance;

public class InheritanceCasting {
  public static void main(String[] args) {
    InheritanceCasting inheritance = new InheritanceCasting();
    // inheritance.objectCast();
    inheritance.objectCastArray();

  }

  public void objectCast() {
    ParentCasting parent = new ParentCasting();
    ChildCasting child = new ChildCasting();

    ParentCasting parent2 = child;
    ChildCasting child2 = (ChildCasting) parent;
  }

  public void objectCastArray() {
    ParentCasting[] parentArray = new ParentCasting[3];
    parentArray[0] = new ChildCasting();
    parentArray[1] = new ParentCasting();
    parentArray[2] = new ChildCasting();
    objectTypeCheck(parentArray);
  }

  private void objectTypeCheck(ParentCasting[] parentArray) {
    for (ParentCasting tempParent : parentArray) {
      if (tempParent instanceof ChildCasting) {
        System.out.println("ChildCasting");
        ChildCasting tempChild = (ChildCasting) tempParent;
        tempChild.printAge();

      } else if (tempParent instanceof ParentCasting) {
        System.out.println("ParentCasting");
      }

      // instanceof의 정확한 원리를 알아야 한다.
//      if(tempParent instanceof ParentCasting){
//        System.out.println("ParentCasting");
//      } else if (tempParent instanceof ChildCasting) {
//        System.out.println("ChildCasting");
//        ChildCasting tempChild = (ChildCasting) tempParent;
//        tempChild.printAge();
//      }
    }
  }
}
