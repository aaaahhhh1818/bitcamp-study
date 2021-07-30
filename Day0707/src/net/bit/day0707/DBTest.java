package net.bit.day0707;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {
<<<<<<< HEAD
  public static void main(String[] args) {
    Connection CN=null; //DBì„œë²„ì—°ê²°ì •ë³´ ì„œë²„ipì£¼ì†Œ ê³„ì •id,pwd
    Statement ST=null;  //ST=CN.createStatement()ëª…ë ¹ì–´ìƒì„± ì‚­ì œ,ì‹ ê·œë“±ë¡,ì¡°íšŒí•˜ë¼
    ResultSet RS=null;  //selectì¡°íšŒê²°ê³¼ê°’ ì „ì²´ë°ì´í„°ë¥¼ ê¸°ì–µí•©ë‹ˆë‹¤
    String msg="";
    int Gtotal = 0;  
    Scanner sc = new Scanner(System.in);
    
   try {  
     Class.forName("oracle.jdbc.driver.OracleDriver"); //ì˜¤ë¼í´ë“œë¼ì´ë¸Œë¡œë“œ
     CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
     //System.out.println("ì˜¤ë¼í´ ë“œë¼ì´ë¸Œë° ì„œë²„ì—°ê²°ì„±ê³µ ");
     
    //ì²«ë²ˆì§¸ëª…ë ¹ì–´ìƒì„±
     ST = CN.createStatement();
      /////////////////////////////////////////////////////////////////
      String sql ="select count(*) as hit  from test ";
      RS = ST.executeQuery(sql);
      if( RS.next()==true) { Gtotal = RS.getInt("hit"); }
      /////////////////////////////////////////////////////////////////
      
      System.out.println("í”„ë¡œê·¸ëž¨ ì „ì²´ë°ì´í„° ì½ì–´ì˜¤ëŠ”ì¤‘ìž…ë‹ˆë‹¤");
      Thread.sleep(1000);
      msg = "select * from  test " ; //ë¬¸ìžì—´ì„ ëª…ë ¹ì–´ ì¸ì‹í•´ì„œ ì‹¤í–‰í•˜ë„ë¡ Statement
      RS = ST.executeQuery(msg);
      
      System.out.println("--------------- ë°ì´í„° ì¶œë ¥ -----------------");
      System.out.println("\t\t\t    ì „ì²´ë ˆì½”ë“œê°¯ìˆ˜:" + Gtotal);
      System.out.println("ì½” ë“œ\tì´ ë¦„\tì œ ëª©\të‚  ì§œ\t   ì¡°íšŒìˆ˜");
     while(RS.next()==true) {
        //í•„ë“œì ‘ê·¼í•´ì„œ ë°ì´í„°ê°€ì ¸ì˜¬ë•Œ getXXX()
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        java.util.Date udt = RS.getDate("wdate");
        String utitle = RS.getString("title");
        int ucnt = RS.getInt("cnt");
        System.out.println(ucode +"\t" + uname+"\t" + utitle+"\t" + udt+"\t" + ucnt);
      }//while end
     
      //System.out.println();dfg
      //System.out.println("codeí•„ë“œë¡œ ì¡°íšŒ ë°ì´í„° ì‚­ì œí•©ë‹ˆë‹¤");
      //ì‚­ì œì²˜ë¦¬ ì¢‹ì•„ìš”  msg = " delete  where code 
      Thread.sleep(1000);
   }catch(Exception ex) { System.out.println("ì—ëŸ¬ì´ìœ  " + ex);}  
   sc.close();
  }//main end
  
}//class END
=======
	public static void main(String[] args) {
		Connection CN=null; //DB¼­¹ö¿¬°áÁ¤º¸ ¼­¹öipÁÖ¼Ò °èÁ¤id,pwd
		Statement ST=null;  //ST=CN.createStatement()¸í·É¾î»ý¼º »èÁ¦,½Å±Ôµî·Ï,Á¶È¸ÇÏ¶ó
		ResultSet RS=null;  //selectÁ¶È¸°á°ú°ª ÀüÃ¼µ¥ÀÌÅÍ¸¦ ±â¾ïÇÕ´Ï´Ù
		String msg="";
		int Gtotal = 0;  
		Scanner sc = new Scanner(System.in);
		
	 try {	
		 Class.forName("oracle.jdbc.driver.OracleDriver"); //¿À¶óÅ¬µå¶óÀÌºê·Îµå
		 CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
		 //System.out.println("¿À¶óÅ¬ µå¶óÀÌºê¹× ¼­¹ö¿¬°á¼º°ø ");
		 
		//Ã¹¹øÂ°¸í·É¾î»ý¼º
		 ST = CN.createStatement();
	    /////////////////////////////////////////////////////////////////
	    String sql ="select count(*) as hit  from test ";
	    RS = ST.executeQuery(sql);
	    if( RS.next()==true) { Gtotal = RS.getInt("hit"); }
	    /////////////////////////////////////////////////////////////////
	    
	    System.out.println("ÇÁ·Î±×·¥ ÀüÃ¼µ¥ÀÌÅÍ ÀÐ¾î¿À´ÂÁßÀÔ´Ï´Ù");
	    Thread.sleep(1000);
	    msg = "select * from  test " ; //¹®ÀÚ¿­À» ¸í·É¾î ÀÎ½ÄÇØ¼­ ½ÇÇàÇÏµµ·Ï Statement
	    RS = ST.executeQuery(msg);
	    
	    System.out.println("--------------- µ¥ÀÌÅÍ Ãâ·Â -----------------");
	    System.out.println("\t\t\t    ÀüÃ¼·¹ÄÚµå°¹¼ö:" + Gtotal);
	    System.out.println("ÄÚ µå\tÀÌ ¸§\tÁ¦ ¸ñ\t³¯ Â¥\t   Á¶È¸¼ö");
	   while(RS.next()==true) {
	    	//ÇÊµåÁ¢±ÙÇØ¼­ µ¥ÀÌÅÍ°¡Á®¿Ã¶§ getXXX()
	    	int ucode = RS.getInt("code");
	    	String uname = RS.getString("name");
	    	java.util.Date udt = RS.getDate("wdate");
	    	String utitle = RS.getString("title");
	    	int ucnt = RS.getInt("cnt");
	    	System.out.println(ucode +"\t" + uname+"\t" + utitle+"\t" + udt+"\t" + ucnt);
	    }//while end
	   
	    //System.out.println();dfg
	    //System.out.println("codeÇÊµå·Î Á¶È¸ µ¥ÀÌÅÍ »èÁ¦ÇÕ´Ï´Ù");
	    //»èÁ¦Ã³¸® ÁÁ¾Æ¿ä  msg = " delete  where code 
	    Thread.sleep(1000);
	 }catch(Exception ex) { System.out.println("¿¡·¯ÀÌÀ¯ " + ex);}	
	 sc.close();
	}//main end
	
}//class END
 








>>>>>>> 507a6b8618964bc69b0504184be8227b11b644ae
