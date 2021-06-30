package net.hb.day0628;

import java.util.Scanner;

public class TestGugudan{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dan = 1 ; //변수초기화 

    System.out.print("원하는 단 입력 >>> ");
    try {
      dan=sc.nextInt();
    }catch(Exception ex) { }

    for(int i=1; i<10; i++) {
      System.out.println(dan+"*"+i+"="+(dan*i));
    }



    System.out.println();
    System.out.println("우리나라");
    System.out.println("대한민국");
    System.out.println("금수강산");
    sc.close(); //권장사항
  }//end
}//TestGugudan class END
