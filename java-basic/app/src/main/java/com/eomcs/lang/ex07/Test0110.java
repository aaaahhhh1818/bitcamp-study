package com.eomcs.lang.ex07;

import java.util.Scanner;


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

  public static int getSpaceLength(int totalStar , int displatStar) {
    return (totalStar - displatStar) / 2;
  }

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpaces(getSpaceLength(len, starLen));
      printStars(starLen);
      System.out.println();
    }
  }

}