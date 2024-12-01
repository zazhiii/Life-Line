package com.zazhi.service;

import com.zazhi.mapper.LandslideMapper;
import com.zazhi.pojo.entity.Landlide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandslideService {

//    @Autowired
//    private LandslideRepository landslideRepository;

    @Autowired
    LandslideMapper landslideMapper;

    /**
     * 获取附近位置的服务方法，支持基于半径和年份的查询。
     *
     * @param latitude 纬度
     * @param longitude 经度
     * @param radius 半径
     * @param year 年份，允许为 null
     * @return 符合条件的位置列表
     */
    public List<Landlide> getNearbyLocations(double latitude, double longitude, double radius, Integer year) {
        if (year == 0) {
            year = null; // 如果 year 为 0，则设置为 null
        }
        return landslideMapper.findNearbyLocations(latitude, longitude, radius, year);
    }
}
