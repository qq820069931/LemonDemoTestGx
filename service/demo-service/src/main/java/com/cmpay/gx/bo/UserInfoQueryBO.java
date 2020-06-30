package com.cmpay.gx.bo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfoQueryBO {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 每页记录数
     */
    private Integer pageSize;
    /**
     * 用户ID
     */
    private Long userNo;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 商户编号
     */
    private String merchantId;
    /**
     * 状态
     */
    private Byte status;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
