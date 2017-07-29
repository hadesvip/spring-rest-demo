package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 2017/7/29.
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "springmvc-rest start....";
    }
}
