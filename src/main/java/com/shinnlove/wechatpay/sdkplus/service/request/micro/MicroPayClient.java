/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.wechatpay.sdkplus.service.request.micro;

import java.util.Map;

import com.shinnlove.wechatpay.sdkplus.config.WXPayMchConfig;
import com.shinnlove.wechatpay.sdkplus.service.request.base.WXPayRequestClient;

/**
 * 微信软pos扫码支付客户端。
 *
 * @author shinnlove.jinsheng
 * @version $Id: MicroPayClient.java, v 0.1 2018-12-18 下午5:30 shinnlove.jinsheng Exp $$
 */
public class MicroPayClient extends WXPayRequestClient {

    /**
     * 构造函数。
     *
     * @param wxPayMchConfig
     */
    public MicroPayClient(WXPayMchConfig wxPayMchConfig) {
        super(wxPayMchConfig);
    }

    @Override
    public void fillRequestDetailParams(Map<String, String> keyPairs) {

    }

    @Override
    public void checkParameters(Map<String, String> keyPairs) throws Exception {

    }

}