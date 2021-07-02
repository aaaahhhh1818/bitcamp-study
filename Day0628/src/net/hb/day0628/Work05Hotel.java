package net.hb.day0628;

import java.util.Scanner;

public class Work05Hotel {
  private int floor; //층=행 3층
  private int room; //호=열 5호  3층*5열=15방구성
  private String[][] name = new String[3][5];
  private String title;

  //  public Work05Hotel() {}
  //  public Work05Hotel(String name) {}
  //  public Work05Hotel(String name, int year) {}

  Scanner sc = new Scanner(System.in);

  public void process() {
    int sel = 9;
    while(true) {
      try {
        System.out.print("\n1.투숙  2.퇴실  3.map  4.list  9.종료 >>> ");
        sel = Integer.parseInt(sc.nextLine());
        if(sel == 9) {
          System.out.println("호텔예약프로그램 종료");
          System.exit(1);
        }
        switch(sel) {
          case 1: checkIn(); break;
          case 2: checkOut(); break;
          case 3: map(); break;
          case 4: list(); break;
          default:
            System.out.println("메뉴를 다시 선택해주세요");
            break;
        }//switch end
      }catch (Exception e) {  }
    }//while end

  }//process end

  public void checkIn() {

    System.out.print("몇 층에서 투숙하시겠습니까?(1~3층까지)>>> ");
    floor = Integer.parseInt(sc.nextLine());
    if(floor <1  || floor >3) {
      System.out.println("해당 층은 존재하지 않습니다");
      return;
    }

    System.out.print("몇 호에서 투숙하시겠습니까?(1~5호까지)>>> ");
    room = Integer.parseInt(sc.nextLine());
    if(room < 1 || room >5) {
      System.out.println("해당 객실은 존재하지 않습니다");
      return;
    }

    if(name[floor-1][room-1] == null) {
      System.out.print("이름을 입력하세요>>> ");
      name[floor-1][room-1] = sc.nextLine();

      System.out.println("객실 예약 완료");
    }else {
      System.out.println("이미 예약된 객실입니다");
      return;
    }
  }//checkIn end

  public void checkOut() {
    System.out.print("퇴실할 층?>>> ");
    floor = Integer.parseInt(sc.nextLine());

    System.out.print("퇴실할 호수?>>> ");
    room = Integer.parseInt(sc.nextLine());

    if(name[floor-1][room-1] != null) {
      name[floor-1][room-1] = null;
      System.out.println("퇴실 완료");
    }else {
      System.out.println("빈 방입니다");
      return;
    }
  }//check end

  public void map() { //printAll()=list()=display()
    System.out.println("\n\t[ 투숙상태 ]" );
    for(int i = 0; i < 3; i++) {
      for(int b = 0; b < 5; b++) {
        System.out.print((i+1)+"0"+(b+1)+"\t");
      }

      System.out.println();

      for(int j = 0; j < 5; j++) {
        if(this.name[i][j] == null) {
          System.out.print("\t");
          continue;
        }//if end
        System.out.print(this.name[i][j]+"\t");
      }
      System.out.println("\n--------------------------------------");
    }//for end
  }//map end

  public void list() { //영림쌤 구현해서 보여드리겠습니다 
    System.out.println("\n\t[ list ]");
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 5; j++){
        if(name[i][j] == null) {
          System.out.print( " " + (i+1)+"0"+(j+1) +"호"+"□\t" +"\t"); 
        }else {
          System.out.print( " " + (i+1)+"0"+(j+1) +"호"+"■\t" + name[i][j] + "\t"); 
        }
      } //j end
      System.out.println();
    }//for i end
  }//end

  public static void main(String[] args) {
    Work05Hotel wh = new Work05Hotel();
    wh.process();
  }//end
}//class END
