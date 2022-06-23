package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;

public class Supplier implements Serializable {
    private static final long serialVersionUID = -5673101630987485772L;
    private Integer suid;

    private String suname;

    private String suaddress;

    public Supplier(Integer suid, String suname, String suaddress) {
        this.suid = suid;
        this.suname = suname;
        this.suaddress = suaddress;
    }

    public Supplier() {
        super();
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname == null ? null : suname.trim();
    }

    public String getSuaddress() {
        return suaddress;
    }

    public void setSuaddress(String suaddress) {
        this.suaddress = suaddress == null ? null : suaddress.trim();
    }


}