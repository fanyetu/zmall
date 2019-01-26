package com.fanyetu.zmallmanager.auth.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "parent_id")
    private Integer parentId;

    private String name;

    private String type;

    private String code;

    private Integer sort;

    private Boolean enable;

    @Column(name = "del_flag")
    private Boolean delFlag;
}