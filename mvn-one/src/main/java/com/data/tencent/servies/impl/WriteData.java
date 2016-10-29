package com.data.tencent.servies.impl;

import com.data.tencent.ChangSha;
import com.data.tencent.servies.ExportService;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.Date;


/**
 * Created by Administrator on 2016/10/23.
 */
public class WriteData extends ExportService {

    private static Log logger = LogFactory.getLog(WriteData.class);
    
    public boolean writeToFile(String title,String xdata,String ydata) {

        logger.info("分类标题："+title);
        logger.info("时间刻度："+xdata);
        logger.info("数值："+ydata);
        String str = "";
        long beginDate = (new Date()).getTime();
        try {
            String tempStr = "";
            FileInputStream fis = new FileInputStream(Constant.CONFJ2); //读取模块文件
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            while ((tempStr = br.readLine()) != null)
                str = str + tempStr;
            fis.close();
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

            FileOption.WriteData(str,Constant.NEWDATA,true);
            logger.info("共用时：" + ((new Date()).getTime() - beginDate) + "ms");
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

}
