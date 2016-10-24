package com.data.tencent.servies.impl;

import com.data.tencent.servies.DealService;
import com.data.tencent.utils.Constant;
import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ChangShaDeal extends DealService {

    public String[][] deal(List<String[]> info,String info_){

        if(info == null|| info_==null){
            return null;
        }
        int len = info_.split(",").length;
        String[][] show = new String[len][12];
        int i = 0;
        for (String[] hula : info) {

            int j = 0;
            for (String la : hula) {

                for (String ss : la.split("[^-0-9.]")) {
                    if (!ss.equals("")) {
                        show[i][j++] = ss + ",";
                    }
                }
            }
            i++;
        }

        return show;
    }

    @Override
    public String[][] dealStatic(List list,String info) {

       return deal(list,info);
    }

    @Override
    public Map<String, String> showData(String[][] show) {
        if(show == null){
            return null;
        }
        String title = "";
        String sumydata = "";
        String ydata = "";
        Map result = new HashMap<String,String>();
        for (int m = 0; m < show[0].length-1; m++) {
            title +=  "\""+ Constant.TITLE_name[m] + "\""+",";
            StringBuffer ydata1 = new StringBuffer();
            System.out.println("-----------------------------------");
            sumydata += "{ name:'" + Constant.TITLE_name[m] + "',\n" + " type:'bar',\n";
            sumydata += "data:[";
            for (int l = 0; l < show.length; l++) {
                System.out.print(show[l][m]);
                ydata1.append(show[l][m]);
            }
            sumydata += ydata1.toString().endsWith(",") ? ydata1.toString().substring(0, ydata1.toString().length() - 1) : ydata1.toString();
            sumydata += "]},";
            System.out.println();
        }
        ydata += sumydata.trim() ;
        title = title.endsWith(",") ? title.substring(0, title.length() - 1) : title;
        ydata = ydata.endsWith(",") ? ydata.substring(0, ydata.length() - 1) : ydata;
        result.put("title",title);
        result.put("ydata",ydata);
        return result;
    }
}
