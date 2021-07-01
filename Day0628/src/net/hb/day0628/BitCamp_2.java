package net.hb.day0628;

public class BitCamp_2 extends LA { //LA상속 cherry메소드호출
  public static void main(String[] args) {
    BitCamp_2 bc = new BitCamp_2();
    bc.book();
    bc.cherry(); //이런식으로 접근 가능
  }//end

  public void book() {
    System.out.println("book 몽블랑");
    super.cherry(); //부모클래스 접든 super
    this.cherry(); //this생략가능
  }//end

  //LA클래스에 있는 cherry()메소드 재정의 { 제주산 체리 0:57 }
  @Override
  public void cherry() {
    System.out.println("제주산 체리 11:07");
  }

}//class END
