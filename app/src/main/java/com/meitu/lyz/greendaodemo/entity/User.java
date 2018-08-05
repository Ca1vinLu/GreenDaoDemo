package com.meitu.lyz.greendaodemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

/**
 * @author LYZ 2018.08.05
 */
@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String password;
    private boolean sex;

    @Transient
    private String test;

    @Generated(hash = 1472763677)
    public User(int id, String name, String password, boolean sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getSex() {
        return this.sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
