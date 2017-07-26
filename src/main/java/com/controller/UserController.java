package com.controller;

import com.domain.User;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by wangyong on 2017/7/25.
 */
@Path("/user")
@Component
public class UserController {

    @GET
    @Path("/getUser/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("userId") String userId) {
        System.out.println("userId:" + userId);
        User user = new User();
        user.setAge(20);
        user.setUserId(userId);
        return user;
    }


}
