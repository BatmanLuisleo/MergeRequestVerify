/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.chinasofti.mergerequestverify.exception;

import com.chinasofti.mergerequestverify.status.ErrorStatus;

/**
 * 业务异常
 *
 * @author Li Shijie
 * @since 1.0.0
 */
public class ServiceException extends RuntimeException {

    private Integer errorCode;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(ErrorStatus errorStatus) {
        this(errorStatus.getErrCode(), errorStatus.getErrDesc());
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}