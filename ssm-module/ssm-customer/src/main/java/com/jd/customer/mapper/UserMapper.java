package com.jd.customer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jd.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
