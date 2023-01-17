package d.generic;

public class GenericSample {

  public static void main(String[] args) {
    GenericSample sample = new GenericSample();
    sample.checkGenericDTO();
  }

  public void checkGenericDTO() {
    CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
    dto1.setObject(new String());

    CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
    dto2.setObject(new StringBuffer());

    CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
    dto3.setObject(new StringBuilder());

  }

  public void checkDTO(CastingDTO dto){
    Object tempObject = dto.getObject();

    if(tempObject instanceof StringBuilder){
      System.out.println("StringBuilder");
    } else if (tempObject instanceof StringBuffer) {
      System.out.println("StringBuffer");
    }
  }

}
