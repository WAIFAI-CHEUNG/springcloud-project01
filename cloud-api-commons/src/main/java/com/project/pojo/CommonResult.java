package com.project.pojo;

/**
 * description:
 * date: 2022-02-08 17:23
 * author: waifaicheung
 * version: 1.0 <br>
 */
public class CommonResult<T> {

    private Integer code;//返回状态码
    private String  message;//返回是否调用成功
    private  T data; //返回的数据

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
