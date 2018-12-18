/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.wechatpay.sdkplus.enums;

/**
 * 微信支付类型。
 *
 * @author shinnlove.jinsheng
 * @version $Id: WXPayMode.java, v 0.1 2018-12-18 下午3:51 shinnlove.jinsheng Exp $$
 */
public enum WXPayMode {

    /** 普通商户模式 */
    ORDINARY(0, "普通商户模式"),

    /** 服务商模式 */
    Service(1, "服务商模式");

    private int    code;
    private String message;

    WXPayMode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Getter method for property code.
     *
     * @return property value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter method for property code.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter method for property message.
     *
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property message.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}