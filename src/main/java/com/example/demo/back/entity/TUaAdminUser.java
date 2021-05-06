package com.example.demo.back.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;


/**
 * <p>
 * 管理后台用户表
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
@Data
@TableName("T_UA_ADMIN_USER")
public class TUaAdminUser {

    private static final long serialVersionUID = 1L;

    /**
     * 自增序号
     */
    @TableId(value = "FID", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField("FNAME")
    private String name;

    /**
     * 密码
     */
    @TableField("FPASSWORD")
    private String password;


}
