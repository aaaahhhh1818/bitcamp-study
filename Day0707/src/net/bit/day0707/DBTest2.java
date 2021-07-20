package net.bit.day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest2 {

  static Connection CN=null;
  static Statement ST=null;
  static ResultSet RS=null;
  static String msg="isud=crud쿼리문기술";
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    try {   
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
      CN=DriverManager.getConnection(url,"system","1234");
      System.out.println("오라클 드라이브및 서버연결성공 ");

      ST = CN.createStatement();
    } catch(Exception ex) {
      System.out.println("에러이유" + ex);
    }

    System.out.println("\t[메뉴선택]");

    loop: while (true) {
      System.out.print("1. 데이터 입력\t");
      System.out.print("2. 데이터 출력\t");
      System.out.print("3. 나가기\n");
      System.out.print(">> ");
      String num = sc.nextLine();

      switch (num) {
        case "1": testInsert(); break;
        case "2": testSelect(); break;
        case "3": break loop;
        default:
          System.out.println("다시 입력해주세요");
      }
    }//while END  
    sc.close();

  }//main end

  static void testInsert() {
    try {
      System.out.print("\n코드입력(4자릿수)>>>"); 
      int a=Integer.parseInt(sc.nextLine());
      System.out.print("이름입력>>>"); 
      String b=sc.nextLine();  
      System.out.print("제목입력>>>"); 
      String c=sc.nextLine();

      msg="insert into test(code,name,title,wdate,cnt) values("+a+",'"+b+"','"+c+"',sysdate,0)";   
      System.out.println(msg);

      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a + " 코드 저장");
      }else { System.out.println(a + " 코드 저장실패"); }
    } catch(Exception ex) {
      System.out.println("입력에러" + ex);
    }
  }//testInsert END

  static void testSelect() {
    try {

      //      System.out.println("프로그램 전체 데이터 불러오는중... 잠시만 기다려주세요");
      //      Thread.sleep(3000);
      msg = "select * from test"; //문자열을 명령어 인식해서 실행하도록 Statement
      RS = ST.executeQuery(msg);

      System.out.println("코드\t이름\t");
      while(RS.next() == true) {
        //필드접근해서 데이터가져올 때 getXXX()
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        System.out.println(ucode +"\t" + uname);
      }
    } catch(Exception ex) {
      System.out.println("실행에러" + ex);
    }
  }//testSelect END
}//class END