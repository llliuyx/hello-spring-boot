package com.liu.hellospringboot.utils;

import lombok.Getter;

public class Response<T> {

    public static final int CODE_OK = 0;

    @Getter
    private int status;
    @Getter
    private String msg;
    @Getter
    private T data;

    public Response(int status, T data) {
        this.status = status;
        this.msg = "";
        this.data = data;
    }
}
