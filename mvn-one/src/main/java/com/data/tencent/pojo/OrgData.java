package com.data.tencent.pojo;

/**
 * Created by Administrator on 2016/10/29.
 */
public class OrgData {

    private String date;

    private String data;

    public OrgData(String date, String data) {
        this.date = date;
        this.data = data;
    }

    @Override
    public String toString() {
        return "OrgData{" +
                "date='" + date + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
