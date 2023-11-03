package com.sparta.springprepare.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello") //resources폴더의 해당 path의 파일을 매핑
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect") //해당 path로 redirect(재접근) // 302 - 클라이언트가 추가적인 조치를 취해야 함
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }

}
