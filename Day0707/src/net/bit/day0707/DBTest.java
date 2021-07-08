package net.bit.day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {

  public static void main(String[] args) {
    Connection CN = null;
    Statement ST = null;
    ResultSet RS = null;
    String msg = "isud=crud쿼리문기술";
    Scanner sc = new Scanner(System.in);

    try {
      Class.forName("oracle.jdbc,driver.OracleDriver");
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
      CN = DriverManager.getConnection(url, "system", "1234"); 
      System.out.println("오라클 드라이브 및 서버연결 성공");

      //첫번째명령어생성
      ST = CN.createStatement();

      //키보드에서 데이터 입력

      //      System.out.print("\n코드e입력(4자릿수)>>>");
      //      int a = Integer.parseInt(sc.nextLine());
      //      System.out.print("이름입력>>>");
      //      String b = sc.nextLine();
      //      System.out.print("제목입력>>>");
      //      String c = sc.nextLine();    
    }catch(Exception ex) { System.out.println("에러이유" + ex); }
    sc.close();

  }//main end

  //신규등록, 전체출력성공 후 메소드 생성해서 최대한 메소드 활용
}//class END
