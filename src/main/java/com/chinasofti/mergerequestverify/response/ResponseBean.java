package com.chinasofti.mergerequestverify.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回内容格式
 *
 * @author Li ShiJie
 * @since 1.0.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBean<T> implements Serializable {

    private boolean success;
    private Integer errorCode = 0;
    private String message;

    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseBean() {
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResponseBean(T data) {
        this.data = data;
        this.success = true;
    }

    public static <T> ResponseBean<T> success(T data) {
        return new ResponseBean<>(data);
    }

    public static <T> ResponseBean<PageBase> success(Page<?> page, T data) {
        ResponseBean<PageBase> bean = new ResponseBean<>();
        PageBase<T> base = new PageBase<>();
        base.setTotalPage(page.getPages());
        base.setPageNum(page.getPageNum());
        base.setPageSize(page.getPageSize());
        base.setTotalCount(page.getTotal());
        base.setStartIndex(base.getPageNum() <= 1 ? 0 : 1);
        base.setIsMore(base.getPageNum() >= base.getTotalPage() ? 0 : 1);
        base.setItems(data);
        bean.setData(base);
        bean.setSuccess(true);
        return bean;
    }


    public static ResponseBean<?> success() {
        ResponseBean<?> responseBean = new ResponseBean<>();
        responseBean.setSuccess(true);
        return responseBean;
    }

    public static ResponseBean<?> failure() {
        ResponseBean<?> responseBean = new ResponseBean<>();
        responseBean.setSuccess(false);
        return responseBean;
    }

    public static ResponseBean<?> failure(String message) {
        ResponseBean<?> responseBean = new ResponseBean<>();
        responseBean.setSuccess(false);
        responseBean.setMessage(message);
        return responseBean;
    }

    public static <T> ResponseBean<T> failure(Integer errCode, String message) {
        ResponseBean<T> res = new ResponseBean<>();
        res.setSuccess(false);
        res.setMessage(message);
        res.setErrorCode(errCode);
        return res;
    }



}
