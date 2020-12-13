package com.jd.customer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.common.entity.User;


public interface UserMapper extends BaseMapper<User> {

    /**
     * 分页查询
     */
    IPage<String> selectUserList(Page<?> page);
}
