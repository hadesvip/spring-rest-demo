package com.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by wangyong on 2017/7/25.
 */
public class SpringRestConfig extends ResourceConfig {

    public SpringRestConfig() {

        packages("com.controller");

        //必须注册jackson，否则无法根据application/json 将pojo生成json
        register(JacksonJsonProvider.class);

        //  registerClasses(new Class[]{RequestContextFilter.class, UserController.class});
    }
}
