package com.data.tencent.dao.impl;


import com.data.tencent.dao.Dao;
import com.data.tencent.pojo.ItemData;
import com.data.tencent.servies.impl.StaticsLoad;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.NumberUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ReadFile implements Dao {

    private static Log logger = LogFactory.getLog(ReadFile.class);

    public String[] readFile(String fileName){

            String[] data;
            String tempstr = null;
            try {
                File file = new File(fileName);
                if (!file.exists())
                    throw new FileNotFoundException();

                if (!(file.length() > 1l)) {
                    return null;
                }
                //另一种读取方式
                FileInputStream fis = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis, "gbk"));
                while ((tempstr = br.readLine()) != null) {
                    data = dealString(tempstr);
                    if (data != null) {
                        return data;
                    }
                }
            } catch (IOException ex) {
                logger.info(ex.getStackTrace());
            }
            return null;
    }


    public String[] dealString(String line) {
        List<String> result = new ArrayList<>();
        if (line.contains(Constant.Readkey)) {
            line = line.substring(line.indexOf("完成" + Constant.Readkey), line.length());
            logger.info(line);

            for (String ss : line.split("[^0-9.]")) {  // ^[0-9]*\.{1}[0-9]*")){ //
                if (!ss.equals("")) {
                    char hulo;
//                    logger.info(""+line.charAt(line.indexOf(ss)+ss.length()));
                    if ((hulo = line.charAt(line.indexOf(ss) + ss.length())) == '%') {
//                        logger.info(""+line.substring(line.indexOf(ss)-2,line.indexOf(ss)));
                        if (line.substring(line.indexOf(ss) - 2, line.indexOf(ss)).equals("增长")) {

                            result.add(Double.valueOf(ss) + "%" + "");
                        } else {
                            result.add("-" + Double.valueOf(ss) + "%" + "");

                        }
                    } else {
                        String tmp = line.substring(line.indexOf(ss) + ss.length(), line.indexOf("。", line.indexOf(ss)));
                        if (tmp.contains("百分点") && (!tmp.contains("%"))) {

                            if (line.substring(line.indexOf(ss) - 3, line.indexOf(ss)).trim().equals("增长")) {
                                result.add(Double.valueOf(ss) + "%" + "");
                            } else {
                                result.add("-" + Double.valueOf(ss) + "%"+ "");

                            }
                        } else {
                            result.add(Double.valueOf(ss) + "");
                        }
                    }
                }
            }

//            logger.info("result:"+result.toArray().length);
            logger.info(Arrays.toString(result.toArray()));
            String[] stockArr = new String[result.size()];
            stockArr = result.toArray(stockArr);
            return stockArr;
        }
        return null;
    }


    @Override
    public String[] loadData(String fileName) {
        return readFile(fileName);
    }

    @Override
    public String loadMatchData(String fileName) {
        return loadItemString(fileName);
    }

    /**
     * 获取文件中存在的地产数据
     * 待解析
     * @param fileName
     * @return
     */
    public String loadItemString(String fileName){

        String data = null;
        String tempstr = null;
        BufferedReader br = null;
        try {
            File file = new File(fileName);
            if (!file.exists())
                throw new FileNotFoundException();

            if (!(file.length() > 1l)) {
                return null;
            }

             br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while ((tempstr = br.readLine()) != null) {
                data = getMatchString(tempstr);
                if (data != null) {
                    return data;
                }
            }
        } catch (IOException ex) {
            logger.info(ex.getStackTrace());
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            br = null;
        }
        return null;
    }

    private String getMatchString(String line) {
        if (line.contains("完成"+Constant.Readkey)) {
            line = line.substring(line.indexOf("完成" + Constant.Readkey), line.length());
            return line;
        }else if(line.contains("完成"+Constant.Readkey_quan)){
            line = line.substring(line.indexOf("完成" + Constant.Readkey_quan), line.length());
            return line;
        }else{

        }
        return null;
    }


    public String loadFileInfo(){

        return null;
    }
}
