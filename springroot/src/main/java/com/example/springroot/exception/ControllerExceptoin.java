package com.example.springroot.exception;

import com.example.springroot.enums.ResultEnum;

public class ControllerExceptoin extends RuntimeException {

    private Integer code;


    public ControllerExceptoin(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
