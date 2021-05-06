package com.example.demo.back.service;

import com.example.demo.back.entity.TUaAdminUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 管理后台用户表 服务类
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
public interface ITUaAdminUserService extends IService<TUaAdminUser> {
    int login(TUaAdminUser tUaAdminUser);
}
