package com.data.tencent.Jsoup;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by Administrator on 2016/10/30.
 */
public class App {

    public static void main(String[] args){
        new App().tes();
    }
    public void tes(){
        //        1、利用System.getProperty()函数获取当前路径：
        System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径

//        2、使用File提供的函数获取当前路径：
        File directory = new File("");//设定为当前文件夹
        try{
            System.out.println(directory.getCanonicalPath());//获取标准的路径
            System.out.println(directory.getAbsolutePath());//获取绝对路径
            File f = new File(this.getClass().getResource("/").getPath());
            System.out.println(f.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
