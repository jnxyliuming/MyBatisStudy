package com.liuming.vo;

public class QueryParam {
    private String qName;
    private Integer qDisabled;

    public QueryParam(String qName, Integer qDisabled) {
        this.qName = qName;
        this.qDisabled = qDisabled;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public Integer getqDisabled() {
        return qDisabled;
    }

    public void setqDisabled(Integer qDisabled) {
        this.qDisabled = qDisabled;
    }
}
