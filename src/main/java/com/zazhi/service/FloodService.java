package com.zazhi.service;

import com.zazhi.mapper.FloodMapper;
import com.zazhi.pojo.dto.NearbyFloodDTO;
import com.zazhi.pojo.entity.Flood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FloodService {

    @Autowired
    FloodMapper floodMapper;

    /**
     * 根据经纬度查询附近的水灾信息
     *
     * @param nearByFloodDTO
     * @return
     */
    public List<Flood> findNearbyFloors(NearbyFloodDTO nearByFloodDTO) {
        return floodMapper.findNearbyFloors(nearByFloodDTO);
    }
}
