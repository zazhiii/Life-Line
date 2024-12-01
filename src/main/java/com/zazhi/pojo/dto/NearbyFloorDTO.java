package com.zazhi.pojo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NearbyFloorDTO {
    private double latitude; // 纬度
    private double longitude; // 经度
    private double radius; // 半径km
    private Integer year; // 年份
}
