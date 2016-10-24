package com.data.tencent.logic;

import com.data.tencent.utils.Constant;

import java.util.Map;

/**
 * Created by runzhouwu on 2016/10/24.
 */
public class SplitLogic implements Logic {

    /**
     * 将投资数据 切分
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

    public Map getKeyInfo(String info){


        return null;
    }
}
