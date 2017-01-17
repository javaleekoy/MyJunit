package com.peramdy;

/**
 * Created by Peramdy on 2017/1/17.
 */
public class MyException extends Exception {

    /**
     * @description 无参构造
     */
    public MyException() {
    }

    /**
     * @description 有参构造
     * @param message
     */
    public MyException(String message) {
        super(message);
    }
}
