package ch12;


// 클래스에 생성자가 여러 개 인경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
// 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로
// this() statement 이전에 다른 statement를 쓸 수 없음
public class Person {
  String name;
  int age;

  public Person() {

    this("no name", 1);
  }


  public Person(String name, int age) {

    this.name = name;
    this.age = age;
  }

  public void showPerson() {
    System.out.println(name + ", " + age);
  }

  // 자신의 주소를 반환하는 this
  public Person getPerson() {
    return this;
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.showPerson();

    System.out.println(person);

    Person person2 = person.getPerson();
    System.out.println(person2);
  }
}
