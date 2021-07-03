package ch14_1;

public class TakeTaxiTest {

  public static void main(String[] args) {

    Student studentE = new Student("Edward", 20000);

    Taxi taxi = new Taxi("잘나간다 운수");

    studentE.takeTaxi(taxi);

    studentE.showInfo();

    taxi.showInfo();
  }

}
