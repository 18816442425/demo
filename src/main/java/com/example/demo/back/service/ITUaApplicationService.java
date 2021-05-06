package com.example.demo.back.service;

import com.example.demo.back.common.PageBean;
import com.example.demo.back.entity.TUaApplication;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 应用表 服务类
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-27
 */
public interface ITUaApplicationService extends IService<TUaApplication> {

     PageBean<TUaApplication> getApplicationLists(Integer pageNo, Integer size);

     TUaApplication getAppliDetailById(Integer id);

     int appliStatusUpdate(TUaApplication tUaApplication);

     int addApplica(TUaApplication tUaApplication);


}
