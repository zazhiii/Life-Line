package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fire { // 将类名改为首字母大写，符合 Java 命名规范
    private Long id;

    private String FireTime;

    private double FireLat;

    private double FireLon;

    // 其他字段
}
