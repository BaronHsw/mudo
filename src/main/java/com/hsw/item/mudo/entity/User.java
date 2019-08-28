package com.hsw.item.mudo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2019-2020, www.sunline.cn.
 * FileName: User
 *
 * @author huang.sw
 * @description
 * @date 2019/8/28  20:34
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -5611386225028407298L;

    private Integer id;
    private String name;
    private String password;
    private String address;

}

