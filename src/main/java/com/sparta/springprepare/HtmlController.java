package com.sparta.springprepare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/static-hello")
    public String hello() {
        return "hello, html";
    }
}
