package net.hb.day0628;

public class SJ { //make공급처
  public int  getTotal(String name, int aa, int bb) {
    System.out.println(name +"님의 성적합계처리");
    int hap = aa + bb;
    return hap ;
  }//end

  public double getMean(int value) {
    double dd = value/2.0;
    return dd ; 
  }//end

  public char getGrade(double data){
    char grade='F';

    switch((int)data/10) { //평균데이터점수 int정수화
      case 10: 
      case 9:  grade='A'; break;
      case 8:  grade='B'; break;
      case 7:  grade='C'; break;
      case 6:  grade='D'; break;
      default :
        grade='F'; break;
    }
    return grade;
  }//end

  public String result(double data){//함수의중복=오버로딩=OverLoading
    String msg = "합격여부안내문";
    if(data>=70) {
      msg ="축합격";
    }else { msg ="재시험";  }
    return msg;
  }//end

  public String result(double data, int x, int y){//함수의중복=오버로딩=OverLoading
    String msg = "합격여부안내문";
    if(data>=70 && x>=60  && y>=60) {
      msg ="축합격";
    }else { msg ="재시험";  }
    return msg;
  }//end
}//SJ class END







