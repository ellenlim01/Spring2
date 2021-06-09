package com.koreait.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main() {
        return "home";
    }

    @RequestMapping("/home")
    public void home() {}
}
