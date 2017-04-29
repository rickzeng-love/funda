package com.qchery.funda.modules.sys.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Chery
 * @date 2017/3/24 - 下午11:17
 */
public class User {

    private int id;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
