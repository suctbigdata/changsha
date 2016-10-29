package com.data.tencent.pojo;

/**
 * Created by Administrator on 2016/10/29.
 */
public class ItemData {

    private String indexName;
    private String detail;
    private int type;

    public ItemData(String indexName, String detail) {
        this.indexName = indexName;
        this.detail = detail;
    }

    public ItemData(String indexName, String detail, int type) {
        this.indexName = indexName;
        this.detail = detail;
        this.type = type;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ItemData{" +
                "indexName='" + indexName + '\'' +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
