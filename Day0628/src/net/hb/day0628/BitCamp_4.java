package net.hb.day0628;

public class BitCamp_4 extends Father implements AAA, BBB {
  public static void main(String[] args) {
    BitCamp_4 bc4 = new BitCamp_4();
    bc4.game();
  }//end

  public void game() {
    System.out.println("삼국지 ");
    int m = this.bank();
  }//end

  @Override
  public void apple() {
    System.out.println("BitCamp_4소속의 apple 메소드");
  }//end

  @Override
  public String memo() {
    return null;
  }//end

  @Override
  public boolean nullCheck(int key) {
    return false;
  }//end

  @Override
  public void blue() {    
  }//end

}//class END
