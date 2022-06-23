package org.chengshuo.Web_App_01.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -5526213730759464134L;
    private Integer usid;

    private String usname;

    private String usphone;

    private String uspass;

    private String usemail;

    private String usimg;

    public User(Integer usid, String usname, String usphone, String uspass, String usemail, String usimg) {
        this.usid = usid;
        this.usname = usname;
        this.usphone = usphone;
        this.uspass = uspass;
        this.usemail = usemail;
        this.usimg = usimg;
    }

    public User() {
        super();
    }

    public Integer getUsid() {
        return usid;
    }

    public void setUsid(Integer usid) {
        this.usid = usid;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname == null ? null : usname.trim();
    }

    public String getUsphone() {
        return usphone;
    }

    public void setUsphone(String usphone) {
        this.usphone = usphone == null ? null : usphone.trim();
    }

    public String getUspass() {
        return uspass;
    }

    public void setUspass(String uspass) {
        this.uspass = uspass == null ? null : uspass.trim();
    }

    public String getUsemail() {
        return usemail;
    }

    public void setUsemail(String usemail) {
        this.usemail = usemail == null ? null : usemail.trim();
    }

    public String getUsimg() {
        return usimg;
    }

    public void setUsimg(String usimg) {
        this.usimg = usimg == null ? null : usimg.trim();
    }
}