package com.example.demo.back.controller;


import com.example.demo.back.common.ResponseData;
import com.example.demo.back.entity.TUaAdminUser;
import com.example.demo.back.service.ITUaAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 管理后台用户表 前端控制器
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
@RestController
@RequestMapping("/t-ua-admin-user")
public class TUaAdminUserController {
    @Autowired
    ITUaAdminUserService itUaAdminUserService;

    @PostMapping("/login")
    ResponseData login(@RequestBody TUaAdminUser tUaAdminUser){
        if(itUaAdminUserService.login(tUaAdminUser)==1)
            return ResponseData.success();
        return ResponseData.fail();

    }

}
