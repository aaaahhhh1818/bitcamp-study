package net.hb.day0628;

public class LottoUser {

  public static void main(String[] args) {

    Lotto my = new Lotto();
    int[] ret = my.input(); //출력의 목적이 없음 
    my.output(ret);

    int value = my.inputHap();  //리턴값을 안받으면 그냥 호출, 에러는 없지만 의미가 없음 
    System.out.println("숫자합계=" + value);
    System.out.println("숫자합계=" + my.inputHap());

    System.out.println();
    System.out.println("LottoUser 10:08 11:00 ");
  }//end
}//class END
