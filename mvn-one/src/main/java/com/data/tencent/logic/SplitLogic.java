package com.data.tencent.logic;

import com.data.tencent.utils.Constant;
import com.data.tencent.utils.InfoKey;
import com.data.tencent.utils.NumberUtils;

import java.util.*;


/**
 * Created by runzhouwu on 2016/10/24.
 */
public class SplitLogic implements Logic {

    /**
     * 将全部数据切分为一个一个数据段
     * @param strs
     */
    public void splitMulSymbol(String[] strs){

        for(String str :strs){
            String[] info_ = str.split(" ");
            for(String index:info_){
                index = index.trim();
                if(!"".equals(index)){
                    for(String info:index.split(Constant.symbol)){
                        System.out.println(info);
                    }
                }
            }
            System.out.println("---------------------");
        }
    }

    /**
     * 将已经切分的数据转为key-value
     * @param info
     * @return
     */
    public String getKeyInfo(String info){
//        List<String> list = new ArrayList<String>();
//        List<Map<String,String>> list = new ArrayList<HashMap<String,String>>;

        for(InfoKey infoKey:InfoKey.values()){
            if(info.contains(infoKey.getInfo())){
                return infoKey.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
            }
        }

        System.out.println("error:"+info);

        return "";
    }

    public String removeMo(String str){
        if(str.contains("月")){
            int begin = str.indexOf("月")+1;
            int end = str.length();
//            System.out.println(begin+","+end);
            return str.substring(begin,end);
        }else{
            return str;
        }
    }

}
