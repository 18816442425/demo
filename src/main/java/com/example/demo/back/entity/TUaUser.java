package com.example.demo.back.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-28
 */
@Data
@TableName("T_UA_USER")
public class TUaUser  {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "FID", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    @TableField("FPHONE")
    private String phone;

    /**
     * 密码
     */
    @TableField("FPASSWORD")
    private String password;

    /**
     * 名称
     */
    @TableField("FNAME")
    private String name;

    /**
     * 头像
     */
    @TableField("FICON")
    private String icon;

    /**
     * 注册IP
     */
    @TableField("FIP")
    private String ip;

    /**
     * 注册源
     */
    @TableField("FSOURCE")
    private String source;

    /**
     * 状态(0-异常;1-正常)
     */
    @TableField("FSTATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("FCTIME")
    private LocalDateTime ctime;

    /**
     * 更新时间
     */
    @TableField("FUTIME")
    private LocalDateTime utime;


}
