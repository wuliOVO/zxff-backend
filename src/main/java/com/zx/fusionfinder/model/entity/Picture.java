package com.zx.fusionfinder.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 图片
 * @Author Sakura
 * @date 2023/3/30
 * version 1.0
 **/
@Data
public class Picture implements Serializable {

    private String title;

    private String url;

    private static final long serialVersionUID = 1L;
}
