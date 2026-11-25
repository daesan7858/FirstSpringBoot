package com.example.firstspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// 요청 URI 관리 요청 -> 컨트롤러 -> 응답 결과 반환 -> 웹브라우저로 전송
@Controller 
public class HelloController {
    // 요청 URI(요청 파일)을 관리 함수 등록
    //  요청방식 명시  get || post
    //  요청자원이 있는 위치 또는 파일 : path
    //  대소문자 구별, 주소는 웹루트를 의미하는 "/" + 서브폴더 + 파일
    @GetMapping("/hello")
    @ResponseBody // @RestController의 메소드처럼 동작
    public String hello() {
        // 1. 데이터만 응답 = REST API 서비스라고 부름
        //      @RestCorntroller 클래스 필요 - 이미 스프링부트에서 완비
        // 2. 동적 홈페이지가 필요 리소스 templates 폴더 사용
        // 3. @Controller + @ResponseBody = @RestController
        String message = "반갑다; 친구야";
        return message;
    }

    // "/" 요청하면 index()가 실행
    @GetMapping("/")
    public String index() {
        // @Controller 이므로 동적 홈페이지가 반환되어야함
        return "index";  // 동적홈페이지 필요(templates 에 사는 놈)
    }
    

}
