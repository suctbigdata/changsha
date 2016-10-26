package com.data.tencent.servies.impl;

import com.data.tencent.servies.ExportService;
import com.data.tencent.utils.Constant;

import java.io.*;
import java.util.Date;


/**
 * Created by Administrator on 2016/10/23.
 */
public class WriteData extends ExportService {

    public boolean writeToFile(String title,String xdata,String ydata) {

        System.out.println(title);
        System.out.println(xdata);
        System.out.println(ydata);
        String str = "";
        long beginDate = (new Date()).getTime();
        try {
            String tempStr = "";
            FileInputStream is = new FileInputStream(Constant.CONFJ2);//读取模块文件
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while ((tempStr = br.readLine()) != null)
                str = str + tempStr;
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        try {

            str = str.replaceAll(Constant.TITLE,
                    title);
            str = str.replaceAll(Constant.XDATA,
                    xdata);
            str = str.replaceAll(Constant.YDATA,
                    ydata);//替换掉模块中相应的地方

            File f = new File(Constant.NEWDATA);
            BufferedWriter o = new BufferedWriter(new FileWriter(f));
            o.write(str);
            o.close();
            System.out.println("共用时：" + ((new Date()).getTime() - beginDate) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public void export(String[] data) {

        writeToFile(data[0],data[1],data[2]);
    }

    public void WriteData(String data,String file) throws IOException {
        File f = new File(file);
        BufferedWriter o = new BufferedWriter(new FileWriter(f,true));
        o.write(data+"\n");
        o.close();
    }
}
