package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页
 * Created by wangyong on 2017/7/29.
 */
@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("title", "首页");
        return "index";
    }
}
