package entity;

import java.sql.Date;

/**
 * Created by dell on 2019/1/23.
 */
public class Pet  {

    private  Integer petid; //ID
    private String petnamee; //昵称
    private Integer petbreed; //品种
    private Integer petsex; //性别
    private Date birthday; //出生日期
    private String description;//描述

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public String getPetnamee() {
        return petnamee;
    }

    public void setPetnamee(String petnamee) {
        this.petnamee = petnamee;
    }

    public Integer getPetbreed() {
        return petbreed;
    }

    public void setPetbreed(Integer petbreed) {
        this.petbreed = petbreed;
    }

    public Integer getPetsex() {
        return petsex;
    }

    public void setPetsex(Integer petsex) {
        this.petsex = petsex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
