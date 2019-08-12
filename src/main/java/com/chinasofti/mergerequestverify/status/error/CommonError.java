/*
 * Copyright © 2015-2017 WAWSCM Inc. All rights reserved.
 */
package com.chinasofti.mergerequestverify.status.error;

import com.chinasofti.mergerequestverify.status.ErrorStatus;

/**
 * 公共返回错误类型
 *
 * @author Li Shijie
 * @since 1.0.0
 */
public enum CommonError implements ErrorStatus {
    /**
     * 缺少必要请求参数
     */
    MISSING_PARAMETERS(400, "missing_required_parameters"),

    /**
     * 非法请求参数
     */
    ILLEGAL_PARAMETER(401, "illegal_request_parameter"),

    /**
     * 服务器内部异常
     */
    INTERNAL_EXCEPTION(500, "server_internal_exception"),

    /**
     * 请求方法不支持
     */
    NOT_SUPPORTED(415, "request_method_not_supported"),
    /**
     * 商品服务调用失败
     */
    PRODUCT_SERVICE_ERROR(600, "product_service_error"),
    /**
     * 店铺服务错误
     */
    SHOP_SERVICE_ERROR(700, "shop_service_error"),

    /**
     * 仓库服务错误
     */
    STORE_SERVICE_ERROR(800, "store_service_error"),

    AREA_SERVICE_ERROR(900,"area_service_error"),

    USER_SERVICER_ERROR(1000,"user_service_error"),

    ORDER_SERVICER_ERROR(1100,"order_service_error"),


    SQL_ERROR(911,"sql执行无效");

    private Integer errCode;
    private String errDesc;

    public Integer getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }

    CommonError(Integer errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }
}
