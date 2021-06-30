package net.hb.day0628;

import java.io.InputStream;
import java.util.Scanner;

public class Work04emp {
  public static void main(String[] args) {
    //java.util팩키지 Scanner생성자3번째(InputSream)
    InputStream is = System.in ;  
    Scanner sc = new Scanner(is);
    int sabun=0;
    String name=null;

    //해결 키보드입력 Scanner클래스, 반복문,  예외처리, 형변환
    while(true) {
      try {
        System.out.print("\n사번입력>>>");
        sabun=Integer.parseInt(sc.nextLine()); //숫자,문자 다 입력해서 단점 해결 
        System.out.print("이름입력>>>");
        name=sc.nextLine();
        if(name.equals("")  || name.equals(null)){
          System.out.println("이름데이터 정확히 입력하세요");
          continue;
        }
        break;
      }catch (Exception e){    }
    }//while end

    System.out.println();
    System.out.println("사번 = " + sabun);
    System.out.println("이름 = " + name);
  }//end
}//class END