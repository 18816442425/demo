package com.example.demo.back.service;

import com.example.demo.back.entity.TUaUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
public interface ITUaUserService extends IService<TUaUser> {

    TUaUser queryUserByPhone(String fphone);
}
