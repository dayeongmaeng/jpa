package com.jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello (Model model){
        //model : 데이터를 실어서 뷰로 넘길 수 있음
        model.addAttribute("data", "hello!!!");
        return "hello"; //화면 이름
    }
}
