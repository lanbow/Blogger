package com.joker.bremote.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by shichao.liao on 15/5/30.
 */
@Data
public class User {

    private int id;
    private String nickName;
    private int gender;
    private int age;
    private String country;
    private String province;
    private String passWord;
    private Date addTime;
    private Date updateTime;


}
