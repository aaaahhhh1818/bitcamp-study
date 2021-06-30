package net.hb.day0628;

public class BoardBit implements BoardImp  {

  public static void main(String[] args) {

  }//end

  @Override
  public int boardCount() {
    return 0;
  }//end

  @Override
  public boolean boardInsert() {
    return false;
  }//end

  @Override
  public void boardDelete(int num) {
    //@Override생략가능 
  }//end

  public void index() {
    //인터페이스꺼 소속아님, 상속X, 재정의대상X
    //@Override기술하면 에러 
  }//end
}//class END




