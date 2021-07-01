package net.hb.day0628;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Memo extends Frame implements WindowListener {
  private Button btnExit = new Button("종료");
  private Button btnSend = new Button("보내기");
  private TextField tf = new TextField(20);
  private TextArea ta = new TextArea();
  private Font ff = new Font("궁서체", Font.BOLD, 20);

  public Memo() {
    //초간단 메모장
    ta.setFont(ff);
    this.add("Center", ta);

    //이벤트연결 리스너추가
    this.addWindowListener(this); //앞this  뒤this

    //프레임의 메소드값변경
    ta.setBackground(Color.YELLOW);
    this.setSize(450, 400);
    this.setTitle("초간단메모장");
    this.setVisible(true);
  }//end

  public static void main(String[] args) {
    Memo pad = new Memo(); //생성자호출
    //pad.windowClosing(null);
  }//end


  @Override
  public void windowClosing(WindowEvent e) {
    System.out.println("초간단 메모장 프로그램을 종료합니다 1:16 2:38");
    //try {Thread.sleep(5000);}catch(Exception ex) { }
    System.exit(1);
  }

  @Override public void windowOpened(WindowEvent e) { }
  @Override public void windowClosed(WindowEvent e) { }
  @Override public void windowIconified(WindowEvent e) { }
  @Override public void windowDeiconified(WindowEvent e) { }
  @Override public void windowActivated(WindowEvent e) { }
  @Override public void windowDeactivated(WindowEvent e) { }

}//class END
