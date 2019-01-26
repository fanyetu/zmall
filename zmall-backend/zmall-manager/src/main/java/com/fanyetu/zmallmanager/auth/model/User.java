package com.fanyetu.zmallmanager.auth.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String account;

    private String password;

    private String phone;

    private String email;

    private Integer enable;

    @Column(name = "del_flag")
    private Integer delFlag;
}