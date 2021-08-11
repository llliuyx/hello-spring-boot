package com.liu.hellospringboot.utils;

import lombok.Getter;

public class Result {
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_FAIL = 1;

    @Getter
    private int status;
    @Getter
    private String msg;
    @Getter
    private Object data;

    public Result(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Result success() {
        return new Result(CODE_SUCCESS, null, null);
    }

    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, null, data);
    }

    public static Result fail(String msg) {
        return new Result(CODE_FAIL, msg, null);
    }
}
