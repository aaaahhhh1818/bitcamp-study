package net.hb.day0628;

public class TestBook {
  public int m = 78;

  public static void main(String[] args) {
    char a='A', b='0', c=97; // 48~59  65~90 97~122
    System.out.println(a +"\t" + b+"\t" + c);
    int x = a;
    int y = b;
    int z = c;
    System.out.println(x +"\t" + y+"\t" + z);
    System.out.println();
  }//main end




  public  void note() { //static메소드
    int m = 24;
    System.out.println("지역변수 책가격=" + m); //24
    System.out.println("전역변수 책가격=" + this.m); //78
  }//end
}//class END
