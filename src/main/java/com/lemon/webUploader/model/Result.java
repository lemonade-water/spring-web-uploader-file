package com.lemon.webUploader.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result(T data) {
        this.data = data;
        this.code = 0;
        this.msg = "请求成功";
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
