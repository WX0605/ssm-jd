package com.jd.customer.services;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jd.common.entity.User;

public interface UserService extends IService<User> {
    IPage<String> selectUserList(Page<User> page, Integer age);
}
