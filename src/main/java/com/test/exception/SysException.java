package com.test.exception;

/**
 * 异常处理类
 */
public class SysException extends Exception {

    private String msg;

    public SysException(String msg) {
        this.msg = msg;
    }
}
