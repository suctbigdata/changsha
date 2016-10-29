package com.data.tencent.utils;

/**
 * Created by Administrator on 2016/10/29.
 */

public class StringFormater {

    public static final String formaterTitle(String title){
        String new_title = "";
        for(String str:title.split("\\,")){
            new_title += "'" + str + "',";
        }
        new_title = new_title.endsWith(",")?new_title.substring(0,new_title.length()-1):new_title;

        return new_title;
    }
    public static final String formaterTime(String time){

        String new_time = "";
        for(String str:time.split("\\,")){
            new_time += "'" + str + "',";
        }
        new_time = new_time.endsWith(",")?new_time.substring(0,new_time.length()-1):new_time;
        return  new_time;
    }
}
