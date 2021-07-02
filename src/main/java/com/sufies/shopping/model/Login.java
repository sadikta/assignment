package com.sufies.shopping.model;


import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

import javax.persistence.*;


public class Login {

    private String logname;

    private String logpassword;


    public String getLogname() {

        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getLogpassword() {
        return logpassword;
    }

    public void setLogpassword(String logpassword) {
        this.logpassword = logpassword;
    }

    @Override
    public String toString() {
        return "Login{" +
                "logname='" + logname + '\'' +
                ", logpassword='" + logpassword + '\'' +
                '}';
    }
}
