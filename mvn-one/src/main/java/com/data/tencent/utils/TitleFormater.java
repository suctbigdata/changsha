package com.data.tencent.utils;

/**
 * Created by Administrator on 2016/10/30.
 */
public enum TitleFormater {
    gudingtouzi("固定资产投资",new String[]{"全社会固定资产投资","固定资产投资"},true),
    gudingtouzibianhua("固定资产投资变化",new String[]{"全社会固定资产投资增长","固定资产投资下降","固定资产投资增长"}),
    gudingtouzizenfbianhua("固定资产投资增幅变化",
            new String[]{"固定资产投资同比回落","固定资产投资同比提升","固定资产投资增幅回升","固定资产投资增幅回落"}),


    chengzhengystouzi("城镇以上固定资产投资",new String[]{"城镇以上固定资产投资"},true),
    chengzhengystouzibianhua("城镇以上固定资产投资变化",new String[]{"城镇以上固定资产投资增长"},false),
    chengzhengystouzitbbianhua("城镇以上固定资产投资同比变化",new String[]{"城镇以上固定资产投资同比提升"},false),

    fangdictouzi("房地产开发投资",new String[]{"房地产开发投资"},true),
    fangdictouzibianhua("房地产投资变化",new String[]{"房地产开发投资下降","房地产开发投资增长"},false),
    fangdictouzizenfubianhua("房地产投资增幅变化",new String[]{"房地产开发投资增幅回落","房地产开发投资增幅提升"},false),

    shangpingfxsmianji("商品房销售面积",new String[]{"商品房销售面积"},true),
    shangpingfxsmianjibianhua("商品房销售面积变化",new String[]{"商品房销售面积下降","商品房销售面积增长"},false),
    shangpingfxsmianjizfbianhua("商品房销售面积增幅变化",new String[]{"商品房销售面积增幅回落"},false),

    zhuzhaixsmianji("住宅销售面积",new String[]{"住宅销售面积","住宅销面积"},true),
    zhuzhaixsmianjibianhua("住宅销售面积变化",new String[]{"住宅销售面积增长","住宅销面积增长"}),

    gognyetouzi("工业投资",new String[]{"工业投资"}),
    gongyetouzibianhua("工业投资变化",new String[]{"工业投资增长"}),

    jigaitouzi("技改投资",new String[]{"技改投资"}),
    jigaitouzibianhua("技改投资变化",new String[]{"技改投资下降","技改投资增长"}),

    gengxingaizao("更新改造投资",new String[]{"更新改造投资"}),
    gengxingaizaobianhua("更新改造投资变化",new String[]{"更新改造投资增长"}),
    gengxingaizaozfbianhua("更新改造投资增幅变化",new String[]{"更新改造投资增幅回落"}),

    mingshengtouzi("民生投资",new String[]{"民生投资"}),
    mingshengtouzibianhua("民生投资变化",new String[]{"民生投资增长"});

    private String tlKey;
    private String[] valTl;
    private boolean show;

    TitleFormater(String tlKey, String[] valTl) {
        this.tlKey = tlKey;
        this.valTl = valTl;
    }

    TitleFormater(String tlKey, String[] valTl,boolean show) {
        this.tlKey = tlKey;
        this.valTl = valTl;
        this.show = show;
    }

    TitleFormater() {
    }

    public String getTlKey() {
        return tlKey;
    }

    public void setTlKey(String tlKey) {
        this.tlKey = tlKey;
    }

    public String[] getValTl() {
        return valTl;
    }

    public void setValTl(String[] valTl) {
        this.valTl = valTl;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
