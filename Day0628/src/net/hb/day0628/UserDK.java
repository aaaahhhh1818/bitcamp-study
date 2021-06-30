package net.hb.day0628;

import net.common.bit.Dunkin;

public class UserDK {
  public static void main(String[] args) {
    System.out.println("UserDK클래스 3:40");
    Dunkin.donuts(3);
    Dunkin dk = new Dunkin();
    String msg = dk.coffee();
    System.out.println("주문한음료는 " + msg +" 입니다");
  }//end
}//class END