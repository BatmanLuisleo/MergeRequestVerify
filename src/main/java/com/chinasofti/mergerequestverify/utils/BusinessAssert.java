package com.chinasofti.mergerequestverify.utils;



import com.chinasofti.mergerequestverify.exception.ServiceException;

import java.math.BigDecimal;
import java.util.List;

/**
 * 业务校验
 *
 * @author Li ShiJie
 * @since 1.0.0
 */
public abstract class BusinessAssert {

    public static void equal(Object excepted, Object target, Integer errCode, String messgae) {
        if (!excepted.equals(target)) {
            throw new ServiceException(errCode, messgae);
        }
    }

    public static void notEqual(Object excepted, Object target, Integer errCode, String message) {
        if (excepted.equals(target)) {
            throw new ServiceException(errCode, message);
        }
    }

    public static void toLarge(BigDecimal excepted, BigDecimal target, Integer errCode, String message) {
        if (target.doubleValue() > excepted.doubleValue()) {
            throw new ServiceException(errCode, message);
        }
    }


    public static void notNull(Integer errCode, String message, Object... objects) {
        for (Object obj : objects) {
            if (obj == null || "".equals(obj)) {
                throw new ServiceException(errCode, message);
            }
        }
    }

    public static void notEmpty(List<?> list, Integer errCode, String message) {
        if (list == null || list.isEmpty()) {
            throw new ServiceException(errCode, message);
        }
    }

    public static void fail(Integer errCode, String message) {
        throw new ServiceException(errCode, message);
    }

    public static ServiceException exception(Integer errCode, String message) {
        return new ServiceException(errCode, message);
    }

}
