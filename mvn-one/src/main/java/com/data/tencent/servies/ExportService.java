package com.data.tencent.servies;

import com.data.tencent.servies.Service;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ExportService implements Service {

    public void export(String[] data){

    }

    public void writeTojs() throws FileNotFoundException, UnsupportedEncodingException {

        String fromFile = Constant.NEWDATA;
        String toFile = Constant.SELFJS;
        String str = "";
        try {
            String tempStr = "";
            FileInputStream fis = new FileInputStream(fromFile); //读取模块文件
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            while ((tempStr = br.readLine()) != null)
                str = str + tempStr;
            fis.close();

            FileOption.WriteData(str,toFile,true);
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("成功copy 数据");
    }
}
