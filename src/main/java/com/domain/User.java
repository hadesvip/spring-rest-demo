package com.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用户信息
 * Created by wangyong on 2017/7/25.
 */
@Data
@XmlRootElement
public class User {

    /**
     * 用户编号，用户名，邮箱
     */
    private String userId, userName, email;

    /**
     * 年龄
     */
    private int age;
}
