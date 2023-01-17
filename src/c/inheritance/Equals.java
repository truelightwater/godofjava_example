package c.inheritance;

public class Equals {
  public static void main(String[] args) {
    Equals thisObject = new Equals();
    thisObject.equalsMethod2();
  }

  public void equalsMethod() {
    MemberDTO obj1 = new MemberDTO("Kyoung Soo");
    MemberDTO obj2 = new MemberDTO("Kyoung Soo");

    if (obj1==obj2){
      System.out.println("obj1 and obj2 is same");
    } else {
      System.out.println("obj and obj2 is different");
    }
  }

  public void equalsMethod2() {
    MemberDTO obj1 = new MemberDTO();
    MemberDTO obj2 = new MemberDTO();

    if (obj1.equals(obj2)){
      System.out.println("obj1 and obj2 is same");
    } else {
      System.out.println("obj1 and obj2 is different");
    }
  }

}
