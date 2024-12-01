package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Landlide {
    private Long id;
    private double latitude;
    private double longitude;
    private String evDate; // 修改为 String 类型

    // 其他字段
}
