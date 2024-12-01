package com.zazhi.service;

import com.zazhi.mapper.FireMapper;
import com.zazhi.pojo.entity.Fire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FireService {

//    @Autowired
//    private FireRepository fireRepository; // 修改为正确的 Repository
    @Autowired
FireMapper fireMapper;

    /**
     * 获取附近位置的服务方法，支持基于半径和年份的查询。
     *
     * @param latitude 纬度
     * @param longitude 经度
     * @param radius 半径
     * @param year 年份，允许为 null
     * @return 符合条件的位置列表
     */
    public List<Fire> findNearbyFires(double latitude, double longitude, double radius, Integer year) {
        // 如果 year 为 0，则设置为 null
        if (year != null && year == 0) {
            year = null;
        }
        // 调用 repository 的方法查询符合条件的火灾数据
        return fireMapper.findNearbyLocations(latitude, longitude, radius, year);
    }
}
