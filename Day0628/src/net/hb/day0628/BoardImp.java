package net.hb.day0628;

public interface BoardImp {
  //메소드선언만=abstract method=추상메소드=명세서
  //abstract키워드 생략가능, 기술해도 에러없음 
  public abstract int boardCount() ;
  public abstract boolean boardInsert();
  public  void  boardDelete(int num);
}//interface END
