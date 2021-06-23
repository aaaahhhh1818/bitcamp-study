package com.eomcs;

import java.util.Date;
import java.util.Scanner;

//01. main() : 프로그램의 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 저장하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
//17. 클래스를 이용하여 메서드를 분류하기
//18. 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.
public class App {

  // 한 개의 게시물을 담을 복합 데이터 변수를 설계 (식판)
  static class Board {
    String title;
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }

  //  // 메서드 밖에 선언했을 때 static을 사용
  //  static final int BOARD_LENGTH = 100;
  //  // class Board를 사용하기 위해 (식판 운반기) 
  //  static Board[] boards = new Board[BOARD_LENGTH];
  //  //  // 게시물 저장 배열
  //  //  static String[] titles = new String[BOARD_LENGTH];
  //  //  static String[] contents = new String[BOARD_LENGTH];
  //  //  static String[] passwords = new String[BOARD_LENGTH];
  //  //  // 조회수 저장 배열
  //  //  static int[] viewCounts = new int[BOARD_LENGTH]; // new로 만드는 변수는 기본적으로 0으로 초기화 된다.
  //  //  // 등록일 저장 배열
  //  //  static Date[] createdDates = new Date[BOARD_LENGTH];
  //  static int size = 0;

  // 위의 변수들 BoardHandler로 가져감

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    // App 클래스에서 만든 Scanner 인스턴스를 BoardHandler와 같이 쓴다. 
    BoardHandler.keyScan = keyScan;

    System.out.println("[게시판 관리]");


    loop: while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      //if (command.equals("quit")) { // 문자열을 조건으로 받음
      //  break;
      //}

      //int index = 0; // 반복문이 반복된다고 계속 생성되지 않음
      // while문이 끝난 뒤에는 해당 변수를 사용할 수 없음
      // (반복문 안에 넣어 제약조건을 걸어주는 것이 낫다!)

      switch (command) {
        case "list": BoardHandler.list(); break;
        case "add": BoardHandler.add(); break;
        case "update": BoardHandler.update(); break;
        case "delete": BoardHandler.delete(); break;
        case "view": BoardHandler.view(); break;
        case "quit":
          break loop; // switch문만 빠져나가기 때문에 while문 앞에 label 붙여야함
        default:
          System.out.println("지원하지 않는 명령입니다.");

      }
    }

    keyScan.close();

    System.out.println("안녕히 가세요!");
  }




}
