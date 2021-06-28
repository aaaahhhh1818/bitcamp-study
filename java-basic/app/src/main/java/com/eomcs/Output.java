package com.eomcs;

public class Output {

  static final int MAX_LENGTH = 100;
  boolean[] camp = new boolean[MAX_LENGTH]; // 0번째 1번째 2번째 3번째 4번째
  int sel=9, num=0;

  void append(Object obj) {
    //캠핑장 예약상태확인 
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } //for end
  }
}
