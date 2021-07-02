package com.sufies.shopping.model;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "signup")
@ToString
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;
    @Column
    private  String susername;
    @Column
    private  String semail;
    @Column
    private  Long sphone;
    @Column
    private  String spassword;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public Long getSphone() {
        return sphone;
    }

    public void setSphone(Long sphone) {
        this.sphone = sphone;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "sid=" + sid +
                ", susername='" + susername + '\'' +
                ", semail='" + semail + '\'' +
                ", sphone=" + sphone +
                ", spassword='" + spassword + '\'' +
                '}';
    }
}
