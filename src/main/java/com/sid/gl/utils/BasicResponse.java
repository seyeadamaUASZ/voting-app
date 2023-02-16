package com.sid.gl.utils;

import lombok.Data;

@Data
public class BasicResponse {
    private int status;
    private String message;
    private Object data;

    public BasicResponse (int status){
        this.status=status;
    }
}
