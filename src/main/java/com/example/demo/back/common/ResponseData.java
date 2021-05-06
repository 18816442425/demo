package com.example.demo.back.common;

import java.io.Serializable;

public class ResponseData implements Serializable {

    private static final long serialVersionUID = -6936648847780505144L;

    private Integer code;//1代表成功，0代表失败

    private String message;

    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseData success(){
        return new ResponseData(1,"request success");
    }

    public static ResponseData success(Object data){
        return new ResponseData(1,"request success",data);
    }


    public static ResponseData fail(){
        return new ResponseData(0,"request fail");
    }



}
