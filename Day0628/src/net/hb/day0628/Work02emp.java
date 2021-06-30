package net.hb.day0628;

import java.io.InputStream;
import java.util.Scanner;

public class Work02emp {
  public static void main(String[] args) {
    //java.util패키지 Scanner생성자3번째(InputStram)
    InputStream is = System.in;
    Scanner sc = new Scanner(is);
    int sabun = 2000;
    String name = "길동";

    //문제 키보드입력 Scanner클래스, 반복문, 예외처리, 형변환

    while(true) {
      try {
        System.out.print("사번입력>>> ");
        sabun = Integer.parseInt(sc.nextLine());
        System.out.print("이름입력>>> ");
        name = sc.nextLine(); 
        break;
      } catch(Exception e) {
        System.out.println("잘못된 입력입니다.");
      }
    }//while END

    sc.close();

    System.out.println();
    System.out.println("사번 = " + sabun);
    System.out.println("이름 = " + name);
  }//end
}//class END