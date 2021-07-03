package ch10;

public class BirthDay {

  private int day;
  private int month;
  private int year;

  private boolean isValid;

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  // pivate으로 제어한 멤버 변수도 public 메서드가 제공되면 접근 가능하지만
  // 변수가 public으로 공개되었을 때보다 pivate일 때 각 변수에 대한 제한을
  // public 메서드에서 제어할 수 있다.
  public void setMonth(int month) {
    if(month < 1 || month > 12) {
      isValid = false;
    }
    else {
      isValid = true;
      this.month = month;
    }
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void showDate() {
    if(isValid) {
      System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
    }
    else {
      System.out.println("유효하지 않은 날짜입니다.");
    }
  }

  //  public boolean getIsValid() {
  //    return isValid;
  //  }

}
