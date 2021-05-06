package com.example.demo.back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.example.demo.back.entity.TUaAdminUser;
import com.example.demo.back.mapper.TUaAdminUserMapper;
import com.example.demo.back.service.ITUaAdminUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 管理后台用户表 服务实现类
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
@Service
public class TUaAdminUserServiceImpl extends ServiceImpl<TUaAdminUserMapper, TUaAdminUser> implements ITUaAdminUserService {

    @Autowired
    TUaAdminUserMapper tUaAdminUserMapper;

    @Override
    public int login(TUaAdminUser tUaAdminUser) {
        Map<SFunction<Object,String>,Object> map=new HashMap<>();
        TUaAdminUser tUaAdminUser1=tUaAdminUserMapper.selectOne(new QueryWrapper<TUaAdminUser>().lambda().eq(TUaAdminUser::getName,tUaAdminUser.getName()));
        if(tUaAdminUser1!=null&&tUaAdminUser1.getPassword().equals(tUaAdminUser.getPassword()))
            return 1;
        return 0;
    }
}
