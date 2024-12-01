package com.zazhi.service;

import com.zazhi.mapper.FloorMapper;
import com.zazhi.pojo.dto.NearbyFloorDTO;
import com.zazhi.pojo.entity.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FloorService {

    @Autowired
    FloorMapper floorMapper;

    /**
     * 根据经纬度查询附近的水灾信息
     *
     * @param nearByFloorDTO
     * @return
     */
    public List<Floor> findNearbyFloors(NearbyFloorDTO nearByFloorDTO) {
        return floorMapper.findNearbyFloors(nearByFloorDTO);
    }
}
