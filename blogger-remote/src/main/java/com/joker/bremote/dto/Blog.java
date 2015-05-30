package com.joker.bremote.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by shichao.liao on 15/5/30.
 */
@Data
public class Blog implements Serializable{

    private static final long serialVersionUID = -4896778313379500011L;
    private int id;
    private String title;
    private String body;
    private int authorId;
    private Date addTime;
    private Date updateTime;

}
