package c.util;
import c.model.MemberDTO;

public class FinalReferenceType {
  final MemberDTO dto = new MemberDTO();

  public static void main(String[] args) {
    FinalReferenceType referenceType = new FinalReferenceType();
    referenceType.checkDTO();
  }

  public void checkDTO() {
    System.out.println(dto);
    // dto = new MemberDTO();     // 이 클래스객체는 FinalReferenceType 2번 이상 생성할 수 없다.
    dto.name = "SangMin";
    System.out.println(dto);
  }
}
