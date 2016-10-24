package com.data.tencent.dao.impl;


import com.data.tencent.dao.Dao;
import com.data.tencent.utils.Constant;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ReadFile implements Dao {


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
                System.out.println(ex.getStackTrace());
            }
            return null;
    }


    public String[] dealString(String line) {
        List<String> result = new ArrayList<>();
        if (line.contains(Constant.Readkey)) {
            line = line.substring(line.indexOf("完成" + Constant.Readkey), line.length());
            System.out.println(line);

            for (String ss : line.split("[^0-9.]")) {  // ^[0-9]*\.{1}[0-9]*")){ //
                if (!ss.equals("")) {
                    char hulo;
//                    System.out.println(""+line.charAt(line.indexOf(ss)+ss.length()));
                    if ((hulo = line.charAt(line.indexOf(ss) + ss.length())) == '%') {
//                        System.out.println(""+line.substring(line.indexOf(ss)-2,line.indexOf(ss)));
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

//            System.out.println("result:"+result.toArray().length);
            System.out.println(Arrays.toString(result.toArray()));
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

    public String loadFileInfo(){

        return null;
    }
}
