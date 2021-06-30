package net.hb.day0628;

public class Work01jumin {

  public static void main(String[] args) {
    String min = "871024-1541965"; //키보드입력대신 초기값
    String min1 = "871024";
    String min2 = "1541965";

    //문제1 총자릿수 6 - 7 13자릿수, 14자릿수
    int len = min.length();
    System.out.println("총자릿수 : " + len);

    //문제2 ******-1541965
    int len1 = min1.length();
    for(int i = 0; i <= len1; i++) {
      System.out.print("*");
    }
    System.out.println("-" + min2);
    //문제3 1/3남자 2/4여자  switch 다시 기술
    //length(), substring(),indexOf(),charAt()

    System.out.print("성별 : ");
    String gender = min2.substring(0,1);

    switch(gender) {
      case "1":
      case "3":
        System.out.println("남자입니다");
        break;
      case "2":
      case "4":
        System.out.println("여자입니다");
        break;
      default:
        System.out.println("알 수 없음");
    }


  }//end
}//class END
