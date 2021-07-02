package net.hb.day0628;

public class Bank {
  //자바언어는 객체지향언어=OOP=Object Oriented Programming
  //챕터6장 5 생성자=constructor=constr
  //기본생성자만 기술 => 기본생성자 생략가능 
  public Bank() { }

  //챕터6장 4 오버로딩 메소드중복, 생성자중복가능 
  public void cal() { }
  public void cal(int m) { } //입금
  public void cal(String name, int m) { } //어느은행, 입금 
}//class END
