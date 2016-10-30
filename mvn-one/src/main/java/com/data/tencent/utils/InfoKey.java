package com.data.tencent.utils;

/**
 * Created by runzhouwu on 2016/10/24.
 */
public enum InfoKey {

    gudingtouziall(1,"全社会固定资产投资",Constant.menu),
    chengzhentouzi(3,"城镇以上固定资产投资",Constant.menu),
    gudingtouzi(6,"固定资产投资",Constant.menu),
    fangdictouzi(2,"房地产开发投资",Constant.menu),
    gengxingaiztouzi(4,"更新改造投资",Constant.menu),
    jigaitouzi(5,"技改投资",Constant.menu),

    shangpingfxiaoshou(11,"商品房销售面积",Constant.menu),
    zhuzhaixiaoshou(12,"住宅销售面积",Constant.menu),
    zhuzhaixiaomian(13,"住宅销面积",Constant.menu),
    gongyetouzi(14,"工业投资",Constant.menu),
    mingshengtouzi(15,"民生投资",Constant.menu),


    zenzhang(21,"增长",Constant.up),
    shangpingfzengzhang(22,"商品房销售面积增长",Constant.single_up),
    zhuzhaixszengzhang(23,"住宅销售额增长",Constant.single_up),
    zenfutisheng(24,"增幅提升",Constant.up),
    zenfuhuiluo(25,"增幅回落",Constant.down),
    xiajiang(26,"下降",Constant.down),
    tongbihuiluo(27,"同比回落",Constant.down),
    tongbitisheng(28,"同比提升",Constant.up),
    zengfuhuisheng(29,"增幅回升",Constant.up),

    shangpingfxiajiang(31,"商品房销售面积下降",Constant.single_down),
    zhuzhaixiajiang(32,"住宅销售额下降",Constant.single_down);


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

    public char getExt() {
        return ext;
    }

    public void setExt(char ext) {
        this.ext = ext;
    }
}
