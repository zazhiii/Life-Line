package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Floor { // 将类名改为首字母大写，符合 Java 命名规范
    private Long id;

    private String WaterTime;

    private double WaterLat;

    private double WaterLon;

    // 其他字段
}
