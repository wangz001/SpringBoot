package com.example.springroot.urils;

import com.example.springroot.domain.Result;

public class ResultUtil {

    public static Result success(Object data){

        Result result=new Result();
        result.setCode(0);
        result.setMessage("请求成功");

        result.setData(data);
        return result;

    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
