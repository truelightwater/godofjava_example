package c.model;

import java.awt.*;
import java.lang.reflect.Member;

public class MemberDTO {
  public String name;
  public String phone;
  public String email;

  public MemberDTO(){
  }

  public MemberDTO(String name){

    this.name = name;
  }

  public MemberDTO(String name, String phone){
    this.name = name;
    this.phone = phone;
  }

  public MemberDTO(String name, String phone, String email){
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  public c.inheritance.MemberDTO getMemberDTO(){
    c.inheritance.MemberDTO dto = new c.inheritance.MemberDTO();
    return dto;
  }

  public String toString() {
    return "Name= "+name+ " Phone= " +phone+ " e-Mail= " +email;
  }

  public boolean equals(Object obj){
    if (this == obj) return true;
    if (this == null) return false;
    if (getClass() != obj.getClass()) return false;

    c.inheritance.MemberDTO other = (c.inheritance.MemberDTO) obj;

    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;

    if (email == null) {
      if (other.phone != null) return false;
    } else if (!phone.equals(other.phone)) return false;

    return true;

  }
}