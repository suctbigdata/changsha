package com.data.tencent.servies.impl;

import com.data.tencent.dao.Dao;
import com.data.tencent.dao.impl.ReadFile;
import com.data.tencent.servies.AccessService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/23.
 */
public class StaticsLoad extends AccessService {

    private Dao loadData;
    private String time = "";

    public StaticsLoad(){
        this.loadData = new ReadFile();
    }

    public List<String[]> loadData(String path){

        List<String[]> result = new ArrayList<>();


        for (int i = 14; i <= 16; i++) {
            for (int j = 2; j <= 12; j++) {
                String file_ = path + "\\" + i + "-" + j + ".txt";
                File file = new File(file_);
                if (file.exists() && file.length() > 1l) {
                    System.out.println(file.getAbsoluteFile());
                    String[] resultData;
                    if ((resultData = loadData.loadData(file.getAbsolutePath())) != null) {
                        time += "\"" + file.getName().replaceAll("[.][^.]+$", "") + "\"" + ",";
                        result.add(resultData);
                    }
                }
            }
        }
        return result;
    }

    public String loadFileInfo(){
        return time;
    }

}
