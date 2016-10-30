package com.data.tencent.utils;

import java.util.Set;
import java.util.TreeSet;

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

    public static final String titleFormater(){
        String new_time = "";
        for(TitleFormater titleFormater:TitleFormater.values()){
            new_time += "'" + titleFormater.getTlKey() + "',";
        }
        new_time = new_time.endsWith(",")?new_time.substring(0,new_time.length()-1):new_time;
        return new_time;
    }

    public static final String selectFalse(){
        String new_time = "";
        for(TitleFormater titleFormater:TitleFormater.values()){
            if(titleFormater.isShow())
                ;
            else
                new_time += "'" + titleFormater.getTlKey() + "':false,";
        }
        new_time = new_time.endsWith(",")?new_time.substring(0,new_time.length()-1):new_time;
        return new_time;
    }


    public static final String[] getTitleFormaterArray(){
        String[] new_time = new String[TitleFormater.values().length];
        int i = 0;
        for(TitleFormater titleFormater:TitleFormater.values()){
            new_time[i++] = "" + titleFormater.getTlKey() + "";
        }
        return new_time;
    }

    public static final String titleFormater(String title){
        String new_time = "";
        for(TitleFormater titleFormater:TitleFormater.values()){
            new_time += "'" + titleFormater.getTlKey() + "',";
        }
        new_time = new_time.endsWith(",")?new_time.substring(0,new_time.length()-1):new_time;
        return new_time;
    }

    public static final String titleFormaterMatch(String title){

        for(TitleFormater titleFormater:TitleFormater.values()){
            for(String str:titleFormater.getValTl()){
                if(str.equals(title)){
                    // 匹配到放回 真实title
                    return titleFormater.getTlKey();
                }
            }
        }
        return "";
    }
}
