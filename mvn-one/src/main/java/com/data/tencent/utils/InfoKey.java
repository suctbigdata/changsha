package com.data.tencent.utils;

/**
 * Created by runzhouwu on 2016/10/24.
 */
public enum InfoKey {

    gudingtouzi(1,"全社会固定资产投资"),
    fangdictouzi(2,"房地产开发投资"),
    chengzhentouzi(3,"城镇以上固定资产投资"),
    gengxingaiztouzi(4,"更新改造投资"),
    jigaitouzi(5,"技改投资"),

    shangpingfxiaoshou(11,"商品房销售面积"),
    zhuzhaixiaoshou(12,"住宅销售面积"),

    shangpingfzengzhang(22,"商品房销售面积增长"),
    zhuzhaixszengzhang(23,"住宅销售额增长"),
    zenzhang(21,"增长");



    private int index;
    private String info;


    InfoKey(int index,String info){
        this.index = index;
        this.info = info;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
