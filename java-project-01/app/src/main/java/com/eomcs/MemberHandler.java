package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler implements Handler {
  // 사용자 정의 데이터 타입
  // => 도메인 객체(domain)
  // => 값 객체(value object)
  // => 데이터 전송 객체(Data Transfer Object; DTO)
  // => 모델 객체(model)
  //
  static class Member {
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  String memberGroupName;
  Scanner keyScan;
  ArrayList memberList = new ArrayList();

  MemberHandler(Scanner keyScan) {
    this.keyScan = keyScan;
    this.memberGroupName = "일반";
  }

  MemberHandler(String memberGroupName, Scanner keyScan) {
    this.memberGroupName = memberGroupName;
    this.keyScan = keyScan;
  }

  public void execute() {
    loop: while (true) {
      // 인스턴스 메서드에서 인스턴스 변수를 사용할 때
      // this를 생략할 수 있다.
      System.out.print(/*this.*/memberGroupName + "/회원 관리> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": list(); break;
        case "add": add(); break;
        case "update": update(); break;
        case "delete": delete(); break;
        case "view": view(); break;
        case "back":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }

  void add() {
    System.out.println("[회원 등록]");

    if (memberList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더 이상 회원을 추가할 수 없습니다.");
      return;
    }

    // 한 개의 회원 데이터를 저장할 변수를 준비
    // Member 설계도에 따라 변수를 만들고 그 주소를 리턴
    Member member = new Member();

    System.out.print("이름: ");
    member.name = keyScan.nextLine();

    System.out.print("이메일: ");
    member.email = keyScan.nextLine();

    System.out.print("비밀번호: ");
    member.password = keyScan.nextLine();

    System.out.print("재직여부:(y/N) ");
    if (keyScan.nextLine().equals("y")) {
      member.working = true;
    } else {
      member.working = false;
    }

    member.registeredDate = new Date(); // 현재 날짜와 시간을 생성하여 배열에 저장

    // 배열에 게시글 정보가 담긴 객체(식판)을 넣는다
    memberList.append(member);

    System.out.println("회원을 등록했습니다.");

  }

  void list() {
    System.out.println("[회원 목록]");

    Object[] arr = memberList.toArray();

    for(int i = 0; i < arr.length; i++) { //배열을 처음부터 끝까지 반복할 때 유용
      Member member = (Member) arr[i];
      System.out.printf("%d, %s, %s, %b\n",
          i,
          member.name, // 컴파일러가 멤버주소의 배열에 저장된 값을 꺼내옴
          String.format("%1$tY-%1$tm-%1td", member.registeredDate),
          member.working);
    }
  }

  void view() {
    System.out.println("[회원 조회]");
    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    System.out.printf("제목: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("등록일: %1$tY-%1$tm-%1td\n", member.registeredDate);
    System.out.printf("재직중: %s\n", member.working ? "예" : "아니오"); // 조건 삼항연산자 사용
  }

  void update() {
    System.out.println("[회원 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    System.out.printf("이름(%s)? ", member.name);
    String name = keyScan.nextLine();

    System.out.printf("이메일(%s)? ", member.email);
    String email = keyScan.nextLine();

    System.out.printf("암호? ", member.password);
    String password = keyScan.nextLine();

    System.out.printf("재직중(%s)? (y/N)", member.working ? "예" : "아니오");
    boolean working = false;
    if (keyScan.nextLine().equals("y")) {
      working = true;
    }


    System.out.println("정말 변경하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    // 배열에서 꺼낸 인스턴스의 각 변수 값을 바꾼다.
    member.name = name;
    member.email = email;
    member.password = password;
    member.working = working;

    System.out.println("회원을 변경하였습니다.");
  }

  void delete() {
    System.out.println("[회원 삭제]");
    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    System.out.println("정말 삭제하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    }

    memberList.remove(index);

    System.out.println("회원을 삭제하였습니다.");
  }
}
