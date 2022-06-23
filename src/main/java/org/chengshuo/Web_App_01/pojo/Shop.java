package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;

public class Shop implements Serializable {
    private static final long serialVersionUID = 5615782456521071924L;
    private Integer sid;

    private String sname;

    private Double sprice;

    private Integer snum;

    private Integer stid;

    private Integer suid;

/*
* 价格区间
*
* */
    private Double startMoney;
    private Double endMoney;

    public Double getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(Double startMoney) {
        this.startMoney = startMoney;
    }

    public Double getEndMoney() {
        return endMoney;
    }

    public void setEndMoney(Double endMoney) {
        this.endMoney = endMoney;
    }

    //    1v1
    private Shoptype st;
    private Supplier sp;

    public Shoptype getSt() {
        return st;
    }

    public void setSt(Shoptype st) {
        this.st = st;
    }

    public Supplier getSp() {
        return sp;
    }

    public void setSp(Supplier sp) {
        this.sp = sp;
    }

    public Shop(Integer sid, String sname, Double sprice, Integer snum, Integer stid, Integer suid) {
        this.sid = sid;
        this.sname = sname;
        this.sprice = sprice;
        this.snum = snum;
        this.stid = stid;
        this.suid = suid;
    }

    public Shop() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

}