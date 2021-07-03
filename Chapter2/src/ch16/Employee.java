package ch16;

public class Employee {

  private static int serialNum = 1000;

  private int employeeId;
  private String employeeName;
  private String department;

  public Employee() {
    serialNum++;
    employeeId = serialNum;
  }


  // 인스턴스 생성과 상관없이 클래스 이름으로 바로 호출해서 사용 가능
  public static int getSerialNum() {
    int i = 0; //지역변수

    //    employeeName = "Lee"; //인스턴스 변수 사용 X

    return serialNum; //static 변수
  }

  public int getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
  public String getEmployeeName() {
    return employeeName;
  }
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }


}
