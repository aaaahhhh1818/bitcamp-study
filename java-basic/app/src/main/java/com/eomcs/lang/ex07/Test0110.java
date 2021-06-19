package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0110 {

  static void printSpaces(int len) {
    for(int count = 0; count < len; count++) {
      System.out.print(" ");
    }
  }

  static void printStars(int len) {
    for(int count = 0; count < len; count++) {
      System.out.print("*");
    }
  }

  static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    int starLen = 1;
    while (starLen <= len) {
      printSpaces((len - starLen) / 2);
      printStars(len);
    }

    // 출력 줄 바꾸기
    System.out.println();
    starLen += 2;

  }

}