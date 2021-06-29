package net.hb.day0628;

public class SJUser { //use소비자
  public static void main(String[] args) {
    SJ sj = new SJ();

    String id="길동";
    int first=100;
    int second=55;
    int total = sj.getTotal(id, first, second);
    double avg = sj.getMean(total);
    char ret = sj.getGrade(avg);
    //합격조건 평균이 70점부터, 각과목별 60점부터 
    //함수의중복=오버로딩=overLoading
    String info = sj.result(avg, first, second);

    System.out.println("합계=" +  total);
    System.out.println("평균=" +  avg);
    System.out.println("학점=" +  ret);
    System.out.println("결과=" +  info);
    //setTitle, getTitle
  }//main end
}//class END






