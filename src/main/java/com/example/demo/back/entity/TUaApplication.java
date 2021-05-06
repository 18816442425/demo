package com.example.demo.back.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Date;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * <p>
 * 应用表
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-27
 */
@Data
@TableName("T_UA_APPLICATION")
public class TUaApplication  {

    private static final long serialVersionUID = 1L;

    /**
     * 自增序号
     */
    @TableId(value = "FID", type = IdType.AUTO)
    private Integer id;

    /**
     * 应用名称
     */
    @TableField("FNAME")
    private String name;

    /**
     * 应用包名
     */
    @TableField("FPACKAGE")
    private String packageName;

    /**
     * 应用ID
     */
    @TableField("FAPPID")
    private String appid;

    /**
     * 应用密钥
     */
    @TableField("FAPP_SECRET")
    private String appSecret;

    /**
     * 状态(0-下线;1-上线)
     */
    @TableField("FSTATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("FCTIME")
    private Date ctime;

    /**
     * 更新时间
     */
    @TableField("FUTIME")
    private Date utime;


}
