package com.eomcs;

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
//19. 메뉴 선택 기능 추가하기
//20. 리팩토링: extract method => 게시글 관리 메뉴 처리 코드를 별도의 메서드를 분리한다.
//21. 리팩토링:
//       - 메서드 이동 => 게시글을 다루는 일은 BoardHandler에게 맡긴다.
//       - 클래스 이동 => Board 클래스를 사용하는 BoardHandler로 옮긴다.
//22. 메뉴 추가하기
//      - 회원 관리 기능을 추가하기(미완성)
//      - 계산기 기능 추가하기(완성)
//23. 메뉴를 실행하는 핸들러의 사용 규칙을 통일하기 : 인터페이스 문법의 용도
//      - 규칙 정의 : Handler
//      - 규칙을 이행(implement) : BoardHandler, MemberHandler, ComputeHandler
//24. 회원 관리 기능 완성하기
//      - 회원 정보를 담을 데이터 타입을 새로 설계한다. => Member
//      - 회원 등록, 목록 조회, 상세 조회, 변경, 삭제 기능을 구현한다.
//      - 게시글과 회원 데이터를 함께 보관할 때 문제점 확인하기
//25. 회원 데이터를 별도의 목록으로 관리하기 (단순한 방법 = 유지보수가 어렵다)
//      - 기존의 ArrayList 클래스를 복사하여 ArrayList2를 만든다
//26. 인스턴스 변수로 배열을 관리하기
//      - ArrayList2.java 는 삭제한다.
//      - ArrayList.java의 변수를 인스턴스 변수로 전환한다.
//      - 메서드에서 작업할 때 사용하는 변수의 주소(인스턴스 주소)를 파라미터로 받는다.
//      - BoardHandler.java와 MemberHandler.java 변경
//        - 각 핸들러가 사용할 ArrayList의 인스턴스 따로 생성한다.
//        - ArrayList의 메서드를 호출할 떄마다 인스턴스 주소를 전달한다.
//27. 인스턴스 변수를 사용하는 메서드는 인스턴스 메서드로 선언하기
//      - ArrayList의 메서드를 클래스 메서드에서 인스턴스 메서드로 전환한다.
//      - BoardHandler 와 MemberHandler 에서 ArrayList의 메서드를 호출할 때
//        인스턴스 메서드 호출 규칙에 따라 변경한다.
//28. 게시판 추가하기(클래스를 복제해서 만들기 => 유지보수가 어렵다)
//      - BoardHandler를 복제하여 BoardHandler2를 만든다.
//29. 여러 개의 게시판을 다룰 수 있도록 BoardHandler의 변수를 인스턴스 변수로 전환한다.
//      - 또한 메서드도 인스턴스 메서드로 전환한다.
//      - BoardHandler2를 삭제한다
//      - 게시판을 구분할 때 사용할 게시판 이름을 담는 인스턴스 변수를 추가한다.
//30. 향후 다양한 그룹의 회원을 관리할 수 있도록 MemberHandler의 변수도 인스턴스 변수로 전환하기
//      - MemberHandler의 스태틱 변수를 인스턴스 변수로 바꾼다.
//      - 메서드도 인스턴스 메서드로 전환한다.
//      - 실무에서는 가능한 향후 확장성을 골혀해서 인스턴스 변수로 주로 선언한다.
//        그러다보니 메서드도 인스턴스 메서드를 정의하게 된다.
//      - ComputrHandler도 인스턴스 변수로 변경하라.
//31. 인스턴스를 만들 때 반드시 값을 설정하도록 강제하기
//      - 생성자 문법을 적용한다.
//      - 생성자를 인스턴스를 생성할 떄 반드시 호출해야하는 메서드이다.
public class App {


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

    // App 클래스에서 만든 Scanner 인스턴스를 BoardHandler, MemberHandler와 같이 쓴다. 

    // 규칙에 따라 만든 클래스에 대해
    // 규칙에서 정의한 메서드를 호출하려면
    // 먼저 그 클래스의 인스턴스를 생성한 후
    // 그 인스턴스를 이용하여 메서드를 호출해야 한다.
    BoardHandler boardHandler = new BoardHandler("게시판1", keyScan);
    BoardHandler boardHandler2 = new BoardHandler("게시판2", keyScan);

    MemberHandler memberHandler = new MemberHandler(keyScan);

    ComputeHandler computeHandler = new ComputeHandler(keyScan);

    menuLoop: while (true) {
      System.out.println("[메뉴]");
      System.out.println("  1: 게시글 관리");
      System.out.println("  2: 게시글 관리2");
      System.out.println("  3: 회원 관리");
      System.out.println("  4: 계산기");
      System.out.print("메뉴를 선택하시오.(종료: quit) [1..3] ");
      String menuNo = keyScan.nextLine();

      switch (menuNo) {
        case "1":
          boardHandler.execute();
          break;
        case "2":
          boardHandler2.execute();
          break;
        case "3":
          memberHandler.execute();
          break;
        case "4":
          computeHandler.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
      System.out.println();
    }

    keyScan.close();

    System.out.println("안녕히 가세요!");
  }


}