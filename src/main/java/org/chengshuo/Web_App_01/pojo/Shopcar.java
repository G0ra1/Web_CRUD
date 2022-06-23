package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;
import java.util.Date;

public class Shopcar implements Serializable {
    private static final long serialVersionUID = 2794972378282139088L;
    private Integer scid;

    private Date addtime;

    private Integer scnum;

    private Integer sid;

    private Integer usid;

    public Shopcar(Integer scid, Date addtime, Integer scnum, Integer sid, Integer usid) {
        this.scid = scid;
        this.addtime = addtime;
        this.scnum = scnum;
        this.sid = sid;
        this.usid = usid;
    }

    public Shopcar() {
        super();
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getScnum() {
        return scnum;
    }

    public void setScnum(Integer scnum) {
        this.scnum = scnum;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUsid() {
        return usid;
    }

    public void setUsid(Integer usid) {
        this.usid = usid;
    }
}