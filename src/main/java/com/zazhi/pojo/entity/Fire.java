package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Setter
@Getter
public class Fire {
    private double latitude; // 纬度

    private double longitude; // 经度

    private Date acqDate; // 火灾日期

    private Time acqTime; // 火灾时间
}
