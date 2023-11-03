package com.sparta.springprepare.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    //Response Header
    //Content-Type: text/html

    //Response Body
    //{"name" : "Robbie", "age":95}
    @GetMapping("/json/string") //생긴건 JSON이지만 TXT로 인식
    @ResponseBody
    public String helloStringJson() { //String 을 반환하는 요청
        return "{\"name\":\"Robbie\",\"age\":95}";
    }
    //Response Header
    //Content-Type: appplication/json

    //Response Body
    //{"name" : "Robbie", "age":95}
    @GetMapping("/json/class") // Spring 내부적으로 JAVA의 객체를 JSON타입으로 바꿈
    //이 탬플릿 없다고 아;;;
    @ResponseBody // HTML반환이 아니라 그냥 데이터 주는거야
    public Star helloClassJson() {
        return new Star("Robbie", 95);

        //Spring의 도움을 받지 않으면 HTTP, SevletResponse 객체에다 Content-Type으로 모두 지정을 해줘야 함
    }
}
