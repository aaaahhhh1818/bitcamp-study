package com.eomcs;

import com.eomcs.App.Board;

public class ArrayList {

  static final int MAX_LENGTH = 100;
  static Object[] list = new Object[MAX_LENGTH];
  static int size = 0;

  static void append(Board obj) {
    list[size++] = obj;
  }

  static Object[] toArray() {
    Object[] arr = new Object[size];

    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

  static Object retrieve(int index) { // 해당 인덱스에 있는 값을 조회
    return list[index];
  }

  static void remove(int index) {
    for (int i = index; i < size-1; i++ ) {
      list[i] = list[i + 1];
    }
    size--;
  }
}
