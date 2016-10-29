package com.data.tencent.pojo;

/**
 * Created by Administrator on 2016/10/29.
 */
public class ShowData {

    // 时间维度
    private String date;
    // 属性
    private String showName;
    // 值
    private String values;

    public ShowData(String date, String showName, String values) {
        this.date = date;
        this.showName = showName;
        this.values = values;
    }


    @Override
    public String toString() {
        return "ShowData{" +
                "date='" + date + '\'' +
                ", showName='" + showName + '\'' +
                ", values='" + values + '\'' +
                '}';
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}
