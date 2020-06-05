package com.gks.itcast.springcloud_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PicController {

    @RequestMapping("/")
    public String main() {
        return "main";
    }
    @RequestMapping("/toTop")
    public String top() {
        return "top";
    }
    @RequestMapping("/toLeft")
    public String left() {
        return "left";
    }
    @RequestMapping("/toRight")
    public String right() {
        return "right";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "loginForm";
    }


}
