package com.jd.customer;

import com.jd.common.entity.User;
import com.jd.customer.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {
    //required = false 由于idea检测mapper可能为空所以会爆红;解决办法@https://blog.csdn.net/ju_362204801/article/details/105973162
    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        // 查询所有数据
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        // 数据库中的数据默认初始5条，则判断查询出来的集合数量是否等于5
        Assert.assertEquals(5, users.size());
    }
}
