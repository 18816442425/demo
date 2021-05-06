package com.example.demo.back.controller;


import com.example.demo.back.common.ResponseData;
import com.example.demo.back.entity.TUaUser;
import com.example.demo.back.service.ITUaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
@RestController
@RequestMapping("/t-ua-user")
public class TUaUserController {

    @Autowired
    ITUaUserService itUaUserService;

    @GetMapping("/userInfoByPhone")
    ResponseData queryUserByPhone(@RequestParam(value = "fphone",required = true) String fphone ){
        TUaUser tUaUser=itUaUserService.queryUserByPhone(fphone);
        if(tUaUser!=null)
            return ResponseData.success(tUaUser);
        return ResponseData.fail();
    }
}
