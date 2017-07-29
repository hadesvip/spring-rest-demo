package com.controller;

import com.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 2017/7/25.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable String userId) {
        System.out.println("userId:" + userId);
        User user = new User();
        user.setAge(20);
        user.setUserId(userId);
        return user;
    }


}
