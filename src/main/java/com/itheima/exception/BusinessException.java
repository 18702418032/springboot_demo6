package com.itheima.exception;

/**
 * ClassName: BusinessException
 * Package: com.itheima.exception
 * Description:
 *
 * @Author wanyutang
 * @Create 2023/5/10 14:25
 * @Version 1.0
 */
//自定义异常处理器，用于封装异常信息，对异常进行分类
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
