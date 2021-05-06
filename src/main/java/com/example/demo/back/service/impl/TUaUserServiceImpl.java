package com.example.demo.back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.back.entity.TUaUser;
import com.example.demo.back.mapper.TUaUserMapper;
import com.example.demo.back.service.ITUaUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
@Service
public class TUaUserServiceImpl extends ServiceImpl<TUaUserMapper, TUaUser> implements ITUaUserService {

    @Autowired
    TUaUserMapper tUaUserMapper;

    @Override
    public TUaUser queryUserByPhone(String fphone) {
        return tUaUserMapper.selectOne(new QueryWrapper<TUaUser>().lambda().eq(TUaUser::getPhone,fphone));
    }
}
