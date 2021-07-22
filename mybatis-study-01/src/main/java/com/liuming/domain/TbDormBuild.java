package com.liuming.domain;

public class TbDormBuild {
    private Integer id;
    private String name;
    private String remark;
    private Integer disabled;

    public TbDormBuild(Integer id, String name, String remark, Integer disabled) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.disabled = disabled;
    }

    public TbDormBuild() {

    }

    public TbDormBuild(String name, String remark, Integer disabled) {
        this.name = name;
        this.remark = remark;
        this.disabled = disabled;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "TbDormBuild{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}
