package com.zazhi.pojo.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Earthquake {

    private Date earthquakeTime; // 地震时间

    private double latitude; // 地震纬度

    private double longitude; // 地震经度

    private double depth; // 地震深度

    private double magnitude; // 地震震级

    private String epicenterLocation; // 震源位置

    private String country; // 地震所在国家

    private String province; // 地震所在省份

    private String city; // 地震所在城市
}
