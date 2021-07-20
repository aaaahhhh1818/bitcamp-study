package net.bit.day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

<<<<<<< HEAD
public class Board { //testí…Œì´ë¸”
  Connection CN=null; //DBì„œë²„ì—°ê²°ì •ë³´ ì„œë²„ipì£¼ì†Œ ê³„ì •id,pwd
  Statement ST=null;  //ST=CN.createStatement()ëª…ë ¹ì–´ìƒì„± ì‚­ì œ,ì‹ ê·œë“±ë¡,ì¡°íšŒí•˜ë¼
  ResultSet RS=null;  //selectì¡°íšŒê²°ê³¼ê°’ ì „ì²´ë°ì´í„°ë¥¼ ê¸°ì–µí•©ë‹ˆë‹¤
  String msg="";
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);
  //CN,ST,RS,msg,Gtotal,sc ì „ì—­ë³€ìˆ˜ëŠ” mainì—ì„œ ì‚¬ìš©ë¶ˆê°€ 

  public void dbConnect() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //ì˜¤ë¼í´ë“œë¼ì´ë¸Œë¡œë“œ
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
      System.out.println("07-09-ê¸ˆìš”ì¼ ì˜¤ë¼í´ ë“œë¼ì´ë¸Œë° ì„œë²„ì—°ê²°ì„±ê³µ ");    
      ST = CN.createStatement(); //ë°˜ë“œì‹œí•„ìˆ˜ 
    }catch(Exception ex){System.out.println("error =" + ex);}
  }//end

  public void dbInsert() {
    try {


    }catch(Exception ex) { }   
  }//end

  public void dbSelectAll() {
    try {
      ST = CN.createStatement();
      msg ="select  * from  test  order by code "; //ë¬¸ìžì—´ì„ ëª…ë ¹ì–´ì²˜ë¦¬ 
      ResultSet rs = ST.executeQuery(msg);
      while(rs.next()==true) {
        int a = rs.getInt("code");
        String b = rs.getString("name");
        String c = rs.getString("title");
        System.out.println(a+"\t"+b+"\t" +c);
      }
      rs.close();
    }catch(Exception ex){System.out.println("ì „ì²´ì¡°íšŒì‹¤íŒ¨ =" + ex); }   
  }//end

  public void dbDelete() {
    try {
      System.out.print("ì‚­ì œí•  ì´ë¦„ ìž…ë ¥>>>");
      String del = sc.nextLine();
      msg ="delete from test where name = '" + del +"'" ;
      System.out.println(msg);
      int OK = ST.executeUpdate(msg); //ì§„ì§œ ì‚­ì œí• ì§€
      if (OK>0){
        System.out.println(del+"ë°ì´í„° ì‚­ì œ ì„±ê³µ");    
      }else {System.out.println(del+"ë°ì´í„° ì‚­ì œ ì‹¤íŒ¨");}
      dbSelectAll();
    }catch(Exception ex) { }      
  }//end

  public void dbEdit() {
    try {
      System.out.print("ìˆ˜ì •code ìž…ë ¥>>>");
      String ecode = sc.nextLine();
      System.out.print("ìˆ˜ì •name ìž…ë ¥>>>");
      String ename = sc.nextLine();
      System.out.print("ìˆ˜ì •title ìž…ë ¥>>>");
      String etitle = sc.nextLine();
      msg ="update test set name = '"+ename+"', title = '"+etitle+"' where code = "+ecode+"" ;
      System.out.println(msg);
      int OK = ST.executeUpdate(msg); //ì§„ì§œ ìˆ˜ì •
      if (OK>0){
        System.out.println(ecode + "ë°ì´í„° ìˆ˜ì • ì„±ê³µ");    
      }else {System.out.println(ecode + "ë°ì´í„° ìˆ˜ì • ì‹¤íŒ¨");}
      dbSelectAll();
    }catch(Exception ex) { }
  }
  public static void main(String[] args) {//ë©”ì¸ë©”ì†Œë“œëŠ” ë©”ëª¨ë¦¬ì— ìžë™ë¡œë“œ=ì‹¤í–‰
    try {   
      Board bbs = new Board();
      bbs.dbConnect(); //ìƒëžµí•˜ë©´ ë¬¸ë²•ì—ëŸ¬ ì—†ìŠµë‹ˆë‹¤
      bbs.dbSelectAll();
      System.out.println();
      //bbs.dbDelete();
      bbs.dbEdit();
    }catch(Exception ex){ }
  }//end
}//Board class END
=======
public class Board { //testÅ×ÀÌºí
	Connection CN=null; //DB¼­¹ö¿¬°áÁ¤º¸ ¼­¹öipÁÖ¼Ò °èÁ¤id,pwd
	Statement ST=null;  //ST=CN.createStatement()¸í·É¾î»ý¼º »èÁ¦,½Å±Ôµî·Ï,Á¶È¸ÇÏ¶ó
	ResultSet RS=null;  //selectÁ¶È¸°á°ú°ª ÀüÃ¼µ¥ÀÌÅÍ¸¦ ±â¾ïÇÕ´Ï´Ù
	String msg="";
	int Gtotal = 0;  
	Scanner sc = new Scanner(System.in);
	
	public void dbConnect() {
	 try {
	  Class.forName("oracle.jdbc.driver.OracleDriver"); //¿À¶óÅ¬µå¶óÀÌºê·Îµå
	  CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	  System.out.println("¿À¶óÅ¬ µå¶óÀÌºê¹× ¼­¹ö¿¬°á¼º°ø ");	 
	  ST = CN.createStatement(); //¹Ýµå½ÃÇÊ¼ö 
	 }catch(Exception ex){System.out.println("error =" + ex);}
	}//end
	
	public void dbInsert() {
	 try {
			 
	 }catch(Exception ex) { }	
	}//end
	
	public void dbSelectAll() {
	 try {
		ST = CN.createStatement();
		msg ="select  * from  test "; //¹®ÀÚ¿­À» ¸í·É¾îÃ³¸® 
		ResultSet rs = ST.executeQuery(msg);
		while(rs.next()==true) {
			int a = rs.getInt("code");
			String b = rs.getString("name");
			String c = rs.getString("title");
			System.out.println(a+"\t"+b+"\t" +c);
		}
		rs.close();
	 }catch(Exception ex) { }	
	}//end
	
	public void dbDelete() {
	 try {
		 System.out.print("»èÁ¦ÇÒ ÀÌ¸§ ÀÔ·Â>>>");
		 String del = sc.nextLine();
		 msg ="delete from test where name = '" + del +"'" ;
		 System.out.println(msg);
		 int OK = ST.executeUpdate(msg);
		 if (OK>0){
		  System.out.println(del+"µ¥ÀÌÅÍ »èÁ¦ ¼º°ø");	 
		 }else {System.out.println(del+"µ¥ÀÌÅÍ »èÁ¦ ½ÇÆÐ");}
	  }catch(Exception ex) { }		
	}//end
	
	public static void main(String[] args) {
	  try {	
		Board bbs = new Board();
		bbs.dbConnect();
		bbs.dbSelectAll();
	  }catch(Exception ex){ }
	}//end
}//Board class END







>>>>>>> 507a6b8618964bc69b0504184be8227b11b644ae
