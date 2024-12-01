package com.zazhi.mapper;

import com.zazhi.pojo.dto.NearbyFloorDTO;
import com.zazhi.pojo.entity.Floor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FloorMapper {

    /**
     * 根据经纬度查询附近的水灾信息
     *
     * @param nearByFloorDTO
     * @return
     */
    List<Floor> findNearbyFloors(NearbyFloorDTO nearByFloorDTO);
}
