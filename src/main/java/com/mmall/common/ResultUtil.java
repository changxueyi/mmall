package com.mmall.common;

/**
 * @ClassName ResultUtil
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/1 19:03
 */
public class ResultUtil {
    private static final String DEFAULT_SUCCESS_MESSAGE = "success";
    private static final String DEFAULT_FAIL_MESSAGE = "error";

    public static Result success() {
        /*Result result = new Result();
        result.setCode(Constants.RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;*/
        return success(null);
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(Constants.RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    public static Result error(String message) {
        /*Result result = new Result();
        result.setCode(Constants.RESULT_CODE_SERVER_ERROR);
        if (message == null || message.length() < 1) {
            message = DEFAULT_FAIL_MESSAGE;
        }
        result.setMessage(message);*/
        return error(Constants.RESULT_CODE_SERVER_ERROR,message);
    }

    public static Result error(int code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;

    }
}