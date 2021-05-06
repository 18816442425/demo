package com.example.demo.back.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.back.common.PageBean;
import com.example.demo.back.entity.TUaApplication;
import com.example.demo.back.mapper.TUaApplicationMapper;
import com.example.demo.back.service.ITUaApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * <p>
 * 应用表 服务实现类
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-27
 */
@Service
public class TUaApplicationServiceImpl extends ServiceImpl<TUaApplicationMapper, TUaApplication> implements ITUaApplicationService {

    @Autowired
    TUaApplicationMapper tUaApplicationMapper;


    /**
     * @ param     [pageNo, size]
     * @ return    com.example.demo.back.common.PageBean<com.example.demo.back.entity.TUaApplication>
     * @ Description 获取应用信息列表
     */
    @Override
    public PageBean<TUaApplication> getApplicationLists(Integer pageNo, Integer size) {
        Page<TUaApplication> page = new Page<>(pageNo, size);
        Page<TUaApplication> userIPage=tUaApplicationMapper.selectPage(page,null);
        PageBean<TUaApplication> pageBean=new PageBean<>();
        pageBean.setPageNo(userIPage.getCurrent());
        pageBean.setPageSize(userIPage.getSize());
        pageBean.setRows(userIPage.getTotal());
        pageBean.setTotalPage(userIPage.getPages());
        List<TUaApplication> lists=userIPage.getRecords();
        pageBean.setLists(lists);
        return pageBean;
    }

    /**
     * @ param     [id]
     * @ return    com.example.demo.back.entity.TUaApplication
     * @ Description   根据id查询应用信息
     */
    @Override
    public TUaApplication getAppliDetailById(Integer id) {
           TUaApplication tUaApplication= tUaApplicationMapper.selectById(id);
           return tUaApplication;
    }

    /**
     * @ param     [tUaApplication]
     * @ return    int
     * @ Description    应用信息更新
     */
    @Override
    public int appliStatusUpdate(TUaApplication tUaApplication){
        return tUaApplicationMapper.updateById(tUaApplication);

    }


    /**
     * @ param     [tUaApplication]
     * @ return    int
     * @ Description  添加应用信息
     */
    @Override
    public int addApplica(TUaApplication tUaApplication) {
        Random random=new Random();
        Date createTime = new Date(System.currentTimeMillis());
        int id=random.nextInt(999999);
        String appid=String.valueOf(id);
        String appSecret  =  UUID.randomUUID().toString();
        tUaApplication.setAppid(appid);
        tUaApplication.setCtime(createTime);
        tUaApplication.setUtime(createTime);
        tUaApplication.setAppSecret(appSecret);
        tUaApplication.setStatus(1);
        return tUaApplicationMapper.insert(tUaApplication);
    }


}
