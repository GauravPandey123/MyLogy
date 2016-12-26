package com.example.mylogy;

/**
 * Created by gpandey on 12/5/2016.
 */

public class MyLogs {
    public static boolean print = true;    //true for printing and false for not

    public MyLogs() {
    }

    /**
     * @param tag
     * @param message
     */

    public static void i(String tag, String message) {
        if (print) {
            android.util.Log.i(tag, message);
        }
    }

    /**
     * @param tag
     * @param message
     */
    public static void d(String tag, String message) {
        if (print) {
            android.util.Log.d(tag, message);
        }
    }

    /**
     * @param tag
     * @param message
     */
    public static void e(String tag, String message) {
        if (print) {
            android.util.Log.e(tag, message);
        }
    }

    /**
     * @param tag
     * @param message
     */
    public static void v(String tag, String message) {
        if (print) {
            android.util.Log.v(tag, message);
        }
    }

    /**
     * @param tag
     * @param message
     */
    public static void w(String tag, String message) {
        if (print) {
            android.util.Log.w(tag, message);
        }
    }
}
