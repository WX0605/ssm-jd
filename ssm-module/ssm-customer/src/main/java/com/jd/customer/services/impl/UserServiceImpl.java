package com.jd.customer.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.common.entity.User;
import com.jd.customer.mapper.UserMapper;
import com.jd.customer.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
