package net.bit.day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Board { //test���̺�
	Connection CN=null; //DB������������ ����ip�ּ� ����id,pwd
	Statement ST=null;  //ST=CN.createStatement()��ɾ���� ����,�űԵ��,��ȸ�϶�
	ResultSet RS=null;  //select��ȸ����� ��ü�����͸� ����մϴ�
	String msg="";
	int Gtotal = 0;  
	Scanner sc = new Scanner(System.in);
	
	public void dbConnect() {
	 try {
	  Class.forName("oracle.jdbc.driver.OracleDriver"); //����Ŭ����̺�ε�
	  CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	  System.out.println("����Ŭ ����̺�� �������Ἲ�� ");	 
	  ST = CN.createStatement(); //�ݵ���ʼ� 
	 }catch(Exception ex){System.out.println("error =" + ex);}
	}//end
	
	public void dbInsert() {
	 try {
			 
	 }catch(Exception ex) { }	
	}//end
	
	public void dbSelectAll() {
	 try {
		ST = CN.createStatement();
		msg ="select  * from  test "; //���ڿ��� ��ɾ�ó�� 
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
		 System.out.print("������ �̸� �Է�>>>");
		 String del = sc.nextLine();
		 msg ="delete from test where name = '" + del +"'" ;
		 System.out.println(msg);
		 int OK = ST.executeUpdate(msg);
		 if (OK>0){
		  System.out.println(del+"������ ���� ����");	 
		 }else {System.out.println(del+"������ ���� ����");}
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







