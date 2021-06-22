package com.eomcs.oop.ex01;

// # 클래스 사용 : 3) 클래스 사용
//
public class Exam0112 {
  public static void main(String[] args) {
    // 여러 개의 변수(메모리)를 묶어서 한 사람의 성적 정보를 저장하라!
    // => 밥, 국, 반찬1, 반찬2, 반찬3 을 쟁반에 담아서 가져오는 상황.

    // 1) 클래스 문법으로 성적 데이터를 저장할 메모리 구조를 설계한다.
    // [클래스]
    // - 다양한 타입의 메모리를 묶어서
    //   새로운 형태의 메모리를 설계하는 문법이다.
    // - 개발자가 새롭게 정의한 데이터 타입이다.
    // - 그래서 "사용자 정의 데이터 타입" 이라 부른다.
    // - 문법:
    //      class 새_데이터_타입_이름 {
    //        변수 선언;
    //        ...
    //      }
    //
    // [새_데이터_타입의_이름]
    // - 대문자로 시작한다.
    // - 여러 단어가 결합된 이름인 경우 각 단어의 시작도 대문자로 작성한다.
    // - 보통 명사형으로 짓는다.
    //

    // 다음은 성적 정보를 저장할 메모리 구조를 클래스로 설계한 것이다.
    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    // 위에서 작성한 설계도에 따라 메모리를 준비해보자!
    Score s; // int 변수 선언하듯이 이렇게 하면 될까?
    //
    // => 이 선언은 설계도에 따라 메모리를 준비시키는 명령이 아니다!!!
    // => Score 설계도에 따라 만든 메모리의 주소를 저장할 변수를 만드는 명령이다.
    // => 이렇게 메모리의 주소를 저장하는 변수를 "레퍼런스(reference)"라 부른다.
    // => int와 같은 primitive data type인 경우
    //    위와 같이 그냥 변수를 선언하면 되지만,
    //    클래스 문법으로 설계한 메모리는 이런 방식으로 만들 수 없다.
    //
    // - 레퍼런스 선언 문법:
    //      클래스명 변수명;
    //

    // 2) 개발자가 새롭게 정의한 메모리 설계도에 따라 메모리를 준비한다.
    // - 문법:
    //      new 클래스명();
    // - 클래스 설계도에 따라 메모리를 생성(사용할 수 있도록 확보)한다.
    // - 이렇게 설계도에 따라 준비된 메모리를 "인스턴스(instance)"라 부른다.
    // - 확보된 메모리를 사용하려면 주소를 보관할 필요가 있다.
    // - 위에서 준비한 레퍼런스(s)에 주소를 보관한다.
    //
    s = new Score();


    // 3) 클래스 설계도에 따라 만든 메모리에 값을 넣어 보자.
    // - 레퍼런스에 저장된 주소를 이용하여 인스턴스 메모리에 접근한다.
    // - 의미:
    //   => s에 저장된 주소로 찾아가서 그 메모리의 각 항목 값을 설정한다.
    //   => s에 저장된 주소로 찾아가서 그 인스턴스의 각 변수에 값을 설정한다.
    //   => s가 가리키는 인스턴스의 각 변수에 값을 설정한다.
    //   => s가 가리키는 인스턴스의 각 필드 값을 설정한다.
    //   => s 인스턴스의 필드 값을 설정한다.
    //   => s 객체의 필드 값을 설정한다.
    //
    s.name = "홍길동"; // s에 저장된 주소로 찾아가서 name 항목에 값 저장
    s.kor = 100; // s에 저장된 주소로 찾아가서 kor 항목에 값 저장
    s.eng = 90;
    s.math = 80;
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;

    // 4) 메모리의 값을 꺼내 보자.
    // - "s에 저장된 주소로 찾아가서 name 항목의 값"
    // - "s가 가리키는 메모리의 name 항목의 값"
    // - "s가 가리키는 인스턴스의 name 값"
    // - "s 인스턴스의 name 값"
    // - "s 객체의 name 값"
    //
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}

// ## 자바 기본 데이터 타입의 변수 선언 vs 클래스의 변수 선언
// - 자바 기본 데이터 타입은 변수를 선언하는 순간 메모리에 생성된다.
//     int a;  // 바로 int 값을 저장할 메모리가 준비된다.
// - 클래스의 변수 선언은 주소를 담는 레퍼런스이다. 따라서 주소를 담는 메모리만 준비된다.
//     Score s;  // 아직 Score 설계도에 따라 변수들이 준비된 상태가 아니다.
// - 클래스의 설계도에 따라 메모리를 준비하려면 따로 new 명령을 사용해야 한다.
//     new Score();
// - 생성된 메모리를 사용하려면 주소를 잘 보관해 두어야 한다.
//     s = new Score();

// ## 클래스 vs 배열
// 클래스(class)
// - 여러 타입을 묶어서 사용자 정의 데이터 타입을 만드는 문법이다.
// - 관련된 기능(메서드, 함수)을 관리하기 편하게 묶는 문법이다.
//
// 배열(array)
// - 단일한 타입의 메모리를 묶는 문법이다.
//
// ## primitive 데이터 타입 변수와 레퍼런스
// - primitive type(byte, short, int, long, float, double, boolean, char)의
//   메모리를 만들 때 변수 선언 만으로 완료된다.
//   변수 이름이 곧 메모리를 가리키는 이름이 된다.
//     예) int age;
//
// - 클래스 이름으로 지정한 변수는 메모리 주소를 저장하는 변수(레퍼런스)이다.
//     예) Score s; <=== "레퍼런스"라 부른다.
//
// - 클래스(사용자 정의 데이터 타입)로 메모리를 만들 때는
//   반드시 new 명령을 사용해야 한다.
//     예) new Score(); <=== "인스턴스"라 부른다.
//
// - 메모리를 만든 후에는 그 주소를 변수에 저장해야만 그 메모리를 사용할 수 있다.
//   예) Score s; <==== 메모리의 주소를 저장할 레퍼런스 준비
//       s = new Score(); <=== 메모리를 확보한 후 그 주소를 레퍼런스에 저장
//
// ## 인스턴스의 각 변수(항목; field)에 접근하기
// - 문법:
//   레퍼런스명.항목명 = 값;
//   예) Score s = new Score();
//       s.name = "홍길동";
//





