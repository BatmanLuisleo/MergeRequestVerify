package com.chinasofti.mergerequestverify.handler;

import com.chinasofti.mergerequestverify.exception.ServiceException;
import com.chinasofti.mergerequestverify.response.ResponseBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理
 *
 * @author Li Shijie
 */
@RestControllerAdvice
public class ChoicenessExceptionHandler {

    @ExceptionHandler({ServiceException.class})
    public ResponseEntity<ResponseBean<?>> handlerServiceException(ServiceException ex) {
        ResponseBean<?> responseBean = ResponseBean.failure();
        responseBean.setErrorCode(ex.getErrorCode());
        responseBean.setMessage(ex.getMessage());
        return new ResponseEntity<>(responseBean, HttpStatus.OK);
    }

    /**
     * 自定义异常返回格式
     *
     * @param ex the exception
     */
    @ExceptionHandler({Exception.class})
    public ResponseEntity<ResponseBean<?>> handlerException(Exception ex) {
        ResponseBean<?> responseBean = ResponseBean.failure();
        responseBean.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        responseBean.setMessage("服务器打了个小盹儿~请稍候再试");
        return new ResponseEntity<>(responseBean, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
