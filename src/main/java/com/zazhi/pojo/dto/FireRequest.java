package com.zazhi.pojo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FireRequest {
    private double latitude;
    private double longitude;
    private double radius;
    private Integer year; // 添加 year 字段
}
