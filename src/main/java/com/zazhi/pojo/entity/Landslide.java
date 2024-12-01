package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Setter
@Getter
public class Landslide {
    private Date evDate; // 事件日期
    private Time evTime; // 事件时间
    private double latitude; // 纬度
    private double longitude; // 经度
    private Integer fatalities; // 人员伤亡
    private Integer injuries; // 人员受伤
    private String ctryName; // 国家
    private String divName; // 行政区划
}
