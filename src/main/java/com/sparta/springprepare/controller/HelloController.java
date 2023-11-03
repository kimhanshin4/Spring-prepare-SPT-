package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //2. 역할 선언
@RequestMapping("/api")
public class HelloController { //1. 클래스 생성

    @GetMapping("/hello") //3. GetMapping으로 api
    @ResponseBody // 다음강의에서 배움 // 다음에있는 바디의 hello를 응답해라?
    public String hello() { //4. 메서드 생성. 클래스에서 문자열로 반환 => resources/templetes에서 html파일 존재여부 탐색
        return "Hello World Again! Greetings!"; // => Dispatcher가 View name의 정보 전달 "그 html 정보를 찾아 반환 해라"
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }
}
