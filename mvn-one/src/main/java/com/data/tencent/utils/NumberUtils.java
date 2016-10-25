package com.data.tencent.utils;

/**
 * Created by runzhouwu on 2016/10/24.
 */
public class NumberUtils {


    public static double getFirstDouble(String str){

        for (String ss : str.split("[^-?0-9.]")) {
            if (!ss.equals("")) {
                System.out.println(ss);
                return Double.valueOf(ss);
            }
        }
        return 0d;
    }
}
