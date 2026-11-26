package com.example.firstspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // httl://인터넷 서버주소
public class HomeController {
    
    // 이 서버의 최상위 루트의 문서를 주세요  => "/"
    // 루트문서는 기본값이 index.html
    @GetMapping("/")        // 메소드 하나와 1:1 대응  => @GetMapping
    @ResponseBody           // 문서파일로 만들어 응답해야함  => @ResponseBody
    public String home() {  // 누구나 호출해야하니 public, 파일을 부르는 거니 String
        return "안농하세오?";// @ResponseBody가 없으면 "" 안의 걸 templates 안의 파일로 인식해서 파일을 하나 만들어야함
    }

    // 인터넷서버 /game을 하면 index.html 문서를 웹브라우저에게 반환
    // 1. /game과 연결되는 매핑함수 정의 > 대충 hellogame()으로 정의
    // 2. Get요청이므로 @GetMapping
    // 3. index.html 홈페이지를 리턴
    //      전부 스프링부트가 해주니, 홈페이지 파일 이름만 주면 됨
    @GetMapping("/game")
    public String hellogame() {
        return "index";
    }


    
}
