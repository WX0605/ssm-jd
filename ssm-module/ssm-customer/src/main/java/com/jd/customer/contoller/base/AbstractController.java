package com.jd.customer.contoller.base;


import com.jd.customer.utils.MPPageConvert;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Controller公共组件
 *
 * @author wangxiao
 * @email 604798240@163.com
 * @date 2020年12月6日
 */

public abstract class AbstractController {
    @Autowired
    protected MPPageConvert mpPageConvert;

}
