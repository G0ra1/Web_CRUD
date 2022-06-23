package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;

public class Shoptype implements Serializable {
    private static final long serialVersionUID = -817343917116425852L;
    private Integer stid;

    private String stname;

    private Integer stsup;

    public Shoptype(Integer stid, String stname, Integer stsup) {
        this.stid = stid;
        this.stname = stname;
        this.stsup = stsup;
    }

    public Shoptype() {
        super();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    public Integer getStsup() {
        return stsup;
    }

    public void setStsup(Integer stsup) {
        this.stsup = stsup;
    }


}