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

        if(info.contains(InfoKey.gudingtouzi.getInfo())){
            return InfoKey.gudingtouzi.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }
        else if(info.contains(InfoKey.fangdictouzi.getInfo())){
            return InfoKey.fangdictouzi.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }
        else if(info.contains(InfoKey.chengzhentouzi.getInfo())){
            return InfoKey.chengzhentouzi.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }
        else if(info.contains(InfoKey.gengxingaiztouzi.getInfo())){
            return InfoKey.gengxingaiztouzi.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }
        else if(info.contains(InfoKey.jigaitouzi.getInfo())){
            return InfoKey.jigaitouzi.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }

        else if(info.contains(InfoKey.shangpingfxiaoshou.getInfo())){
            return InfoKey.shangpingfxiaoshou.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }
        else if(info.contains(InfoKey.zhuzhaixiaoshou.getInfo())){
            return InfoKey.zhuzhaixiaoshou.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"";
        }

        else if(info.contains(InfoKey.shangpingfzengzhang.getInfo())){
            return InfoKey.shangpingfzengzhang.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"%";
        }
        else if(info.contains(InfoKey.zhuzhaixszengzhang.getInfo())){
            return InfoKey.zhuzhaixszengzhang.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"%";
        }

        else if(info.contains(InfoKey.shangpingfxiajiang.getInfo())){
            return InfoKey.shangpingfxiajiang.getInfo()+":-"+ NumberUtils.getFirstDouble(info)+"%";
        }
        else if(info.contains(InfoKey.zhuzhaixiajiang.getInfo())){
            return InfoKey.zhuzhaixiajiang.getInfo()+":-"+ NumberUtils.getFirstDouble(info)+"%";
        }

        else if(info.contains(InfoKey.zenzhang.getInfo())){
            return InfoKey.zenzhang.getInfo()+":"+ NumberUtils.getFirstDouble(info)+"%";
        }
        else{
            System.out.println("error:"+info);
        }

        return "";
    }

    public String removeMo(String str){
        if(str.contains("月")){

            return str.substring(str.indexOf("月"+1),str.length());
        }else{
            return str;
        }
    }

}
