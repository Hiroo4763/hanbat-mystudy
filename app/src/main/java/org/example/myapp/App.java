package org.example.myapp;

import java.util.Scanner;

/** 이 클래스는 한밭대학교 특강 실습 예제를 위한 첫 번째 클래스입니다. <code>App</code> 클래스! */
public class App {
  /** 이 메서드는 entry point이다. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("이름? ");
    String name = scanner.nextLine();
    System.out.printf("안녕하세요 %s 님!\n", name);
    scanner.close();
  }
}
