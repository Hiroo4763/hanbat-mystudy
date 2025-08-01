package org.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

// 톰캣 서버 실행에 관련된 기초 설정을 자동으로 처리
// @EnableAutoConfiguration
// 현재 클래스와 같은 패키지 및 하위 패키지를 다 뒤져서 컴포넌트를 찾아 자동 생성하는 설정.
// RestController 등이 붙은 클래스를 찾는다.
// @ComponentScan

// 이 모든걸 합치는 Annotation
@SpringBootApplication // = @EnableAutoConfiguration + @ComponentScan + @SpringBootConfiguration
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    System.out.println("스프링부트 서버 시작!");
  }
}
