package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by xiaohuang on 2017/12/26.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NullPointerException.class)
    public String getError() {
        return "500";
    }

}
