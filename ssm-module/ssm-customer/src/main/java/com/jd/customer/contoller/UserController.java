package com.jd.customer.contoller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.common.entity.User;
import com.jd.common.utils.R;
import com.jd.customer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

import com.jd.customer.contoller.base.AbstractController;


@RestController
@RequestMapping("/user")
public class UserController extends AbstractController {

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


    @RequestMapping(value = "/userList")
    public R userList(@RequestParam Map<String, Object> params) {
        System.out.println("1111111"+params.toString());
        IPage<String> userList = userService.selectUserList((Page<User>) mpPageConvert.<User>pageParamConvert(params), 25);
        return R.ok().put("page", mpPageConvert.pageValueConvert(userList));
    }
}
