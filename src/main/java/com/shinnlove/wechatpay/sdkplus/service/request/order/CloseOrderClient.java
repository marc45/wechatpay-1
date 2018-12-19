/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.wechatpay.sdkplus.service.request.order;

import java.util.Map;

import com.shinnlove.wechatpay.sdkplus.config.WXPayMchConfig;
import com.shinnlove.wechatpay.sdkplus.consts.WXPayConstants;
import com.shinnlove.wechatpay.sdkplus.service.request.base.WXPayRequestClient;

/**
 * 微信支付-关闭订单客户端
 *
 * @author shinnlove.jinsheng
 * @version $Id: CloseOrderClient.java, v 0.1 2018-12-19 下午1:02 shinnlove.jinsheng Exp $$
 */
public class CloseOrderClient extends WXPayRequestClient {

    /**
     * 构造函数。
     *
     * @param wxPayMchConfig
     */
    public CloseOrderClient(WXPayMchConfig wxPayMchConfig) {
        super(wxPayMchConfig);
    }

    @Override
    public void fillRequestDetailParams(Map<String, String> keyPairs, Map<String, String> payParams) {

    }

    @Override
    public void checkParameters(Map<String, String> keyPairs) throws Exception {

    }

    @Override
    public boolean requestNeedCert() {
        // 关闭订单不需要证书
        return false;
    }

    @Override
    public String payRequestURL(WXPayMchConfig config) {
        if (config.isUseSandBox()) {
            // 沙箱环境
            return WXPayConstants.HTTPS + WXPayConstants.DOMAIN_API
                   + WXPayConstants.SANDBOX_CLOSEORDER_URL_SUFFIX;
        } else {
            // 正式环境
            return WXPayConstants.HTTPS + WXPayConstants.DOMAIN_API
                   + WXPayConstants.CLOSEORDER_URL_SUFFIX;
        }
    }

}