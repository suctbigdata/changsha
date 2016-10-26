package com.data.tencent.utils;

/**
 * Created by runzhouwu on 2016/10/24.
 */
public enum InfoKey {

    gudingtouziall(1,"全社会固定资产投资",'o'),
    gudingtouzi(6,"固定资产投资"+'o'),
    fangdictouzi(2,"房地产开发投资"+'o'),
    chengzhentouzi(3,"城镇以上固定资产投资"+'o'),
    gengxingaiztouzi(4,"更新改造投资"+'o'),
    jigaitouzi(5,"技改投资"+'o'),

    shangpingfxiaoshou(11,"商品房销售面积"+'o'),
    zhuzhaixiaoshou(12,"住宅销售面积"+'o'),

    zenzhang(21,"增长"+'t'),
    shangpingfzengzhang(22,"商品房销售面积增长"+'t'),
    zhuzhaixszengzhang(23,"住宅销售额增长"+'t'),
    zenfutisheng(24,"增幅提升"+'t'),
    zenfuhuiluo(25,"增幅回落"+'-'),

    shangpingfxiajiang(31,"商品房销售面积下降"+'-'),
    zhuzhaixiajiang(32,"住宅销售额下降"+'-');


    private int index;
    private String info;
    private char ext;

    InfoKey(int index,String info){
        this.index = index;
        this.info = info;
    }


    InfoKey(int index,String info,char ext){
        this.index = index;
        this.info = info;
        this.ext = ext;
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
