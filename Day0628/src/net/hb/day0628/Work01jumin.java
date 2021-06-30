package net.hb.day0628;

public class Work01jumin {

  public static void main(String[] args) {
    String min = "871024-1541965"; //키보드입력대신 초기값
    String min1 = "871024";
    String min2 = "2541965";

    //문제1 총자릿수 6 - 7 13자릿수, 14자릿수
    //문제2 ******-1541965
    //문제3 1/3남자 2/4여자  switch 다시 기술
    //length(), substring(),indexOf(),charAt()

    String gender = min2.substring(0,1);

    switch(gender) {
      case "1":
      case "3":
        System.out.println("남자");
        break;
      case "2":
      case "4":
        System.out.println("여자");
        break;
      default:
        System.out.println("알 수 없음");
    }



    System.out.println("******-1541965");
  }//end
}//class END
