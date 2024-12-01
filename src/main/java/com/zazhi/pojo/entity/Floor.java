package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class Floor {
    private Long id;

    private Date startDate; // 开始日期

    private Date endDate; // 结束日期

    private String country; // 国家

    private Double latitude; // 纬度

    private Double longitude; // 经度

    private Integer TotalDeat; // 总死亡人数

    private Integer TotalAffe; // 总受伤人数
}
