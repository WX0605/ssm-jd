package com.jd.customer.services.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.common.entity.User;
import com.jd.customer.mapper.UserMapper;
import com.jd.customer.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    private final UserMapper userMapper;
    @Override
    public IPage<String> selectUserList(Page<User> page) {
        return userMapper.selectUserList(page);
    }


}
