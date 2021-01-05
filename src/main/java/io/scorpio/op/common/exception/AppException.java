package io.scorpio.op.common.exception;

import io.scorpio.op.common.response.ErrorCode;
import io.scorpio.op.common.utils.MessageUtils;
import lombok.Data;

/**
 * 自定义异常
 * @author scorpio
 * @date 2021/1/5 0005
 */
@Data
public class AppException extends RuntimeException {

    private int code;
    private String msg;

    public AppException(int code) {
        this.code = code;
        this.msg = MessageUtils.getMessage(code);
    }

    public AppException(String msg) {
        super(msg);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR;
        this.msg = msg;
    }

    public AppException(int code, String... params) {
        this.code = code;
        this.msg = MessageUtils.getMessage(code, params);
    }

    public AppException(int code, Throwable e) {
        super(e);
        this.code = code;
        this.msg = MessageUtils.getMessage(code);
    }

    public AppException(String msg, Throwable e) {
        super(msg, e);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR;
        this.msg = msg;
    }

}
