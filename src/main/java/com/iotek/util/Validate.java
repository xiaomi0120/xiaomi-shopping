package com.iotek.util;

/**
 * Created by xiaohuang on 2017/12/27.
 */
public class Validate {

    public static void checkNull(String message) {
        throw new NullPointerException(message);

    }
}
