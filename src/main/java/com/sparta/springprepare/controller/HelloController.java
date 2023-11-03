package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //2. 역할 선언
public class HelloController { //1. 클래스 생성

    @GetMapping("/api/hello") //3. GetMapping으로 api주소
    @ResponseBody // 다음강의에서 배움
    public String hello() { //4. 메서드 생성. 클래스에서 문자열로 반환 => resources/templetes에서 html파일 존재여부 탐색
        return "Hello World Again!"; // => Dispatcher가 View name의 정보 전달 "그 html 정보를 찾아 반환 해라"
    }

}
