package com.jd.customer.contoller;


import com.jd.common.base.AbstractController;
import com.jd.common.entity.User;
import com.jd.customer.mapper.UserMapper;
import com.jd.customer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/app")
public class TestController extends AbstractController {

    @Autowired
    private  UserService userService;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "--------------------hello";
    }

    @RequestMapping(value = "/user")
    public String user() {
        // 查询所有数据
        List<User> users = userService.list();
        users.forEach(System.out::println);
        return users.toString();
    }
}
