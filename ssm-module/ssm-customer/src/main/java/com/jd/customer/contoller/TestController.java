package com.jd.customer.contoller;


import com.jd.common.base.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class TestController extends AbstractController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "--------------------hello";
    }

}
