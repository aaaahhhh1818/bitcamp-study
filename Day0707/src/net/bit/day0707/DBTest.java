package net.bit.day0707;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {
	public static void main(String[] args) {
		Connection CN=null; //DB������������ ����ip�ּ� ����id,pwd
		Statement ST=null;  //ST=CN.createStatement()��ɾ���� ����,�űԵ��,��ȸ�϶�
		ResultSet RS=null;  //select��ȸ����� ��ü�����͸� ����մϴ�
		String msg="";
		int Gtotal = 0;  
		Scanner sc = new Scanner(System.in);
		
	 try {	
		 Class.forName("oracle.jdbc.driver.OracleDriver"); //����Ŭ����̺�ε�
		 CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
		 //System.out.println("����Ŭ ����̺�� �������Ἲ�� ");
		 
		//ù��°��ɾ����
		 ST = CN.createStatement();
	    /////////////////////////////////////////////////////////////////
	    String sql ="select count(*) as hit  from test ";
	    RS = ST.executeQuery(sql);
	    if( RS.next()==true) { Gtotal = RS.getInt("hit"); }
	    /////////////////////////////////////////////////////////////////
	    
	    System.out.println("���α׷� ��ü������ �о�������Դϴ�");
	    Thread.sleep(1000);
	    msg = "select * from  test " ; //���ڿ��� ��ɾ� �ν��ؼ� �����ϵ��� Statement
	    RS = ST.executeQuery(msg);
	    
	    System.out.println("--------------- ������ ��� -----------------");
	    System.out.println("\t\t\t    ��ü���ڵ尹��:" + Gtotal);
	    System.out.println("�� ��\t�� ��\t�� ��\t�� ¥\t   ��ȸ��");
	   while(RS.next()==true) {
	    	//�ʵ������ؼ� �����Ͱ����ö� getXXX()
	    	int ucode = RS.getInt("code");
	    	String uname = RS.getString("name");
	    	java.util.Date udt = RS.getDate("wdate");
	    	String utitle = RS.getString("title");
	    	int ucnt = RS.getInt("cnt");
	    	System.out.println(ucode +"\t" + uname+"\t" + utitle+"\t" + udt+"\t" + ucnt);
	    }//while end
	   
	    //System.out.println();dfg
	    //System.out.println("code�ʵ�� ��ȸ ������ �����մϴ�");
	    //����ó�� ���ƿ�  msg = " delete  where code 
	    Thread.sleep(1000);
	 }catch(Exception ex) { System.out.println("�������� " + ex);}	
	 sc.close();
	}//main end
	
}//class END
 








