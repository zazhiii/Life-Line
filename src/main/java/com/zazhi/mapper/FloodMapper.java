package com.zazhi.mapper;

import com.zazhi.pojo.dto.NearbyFloodDTO;
import com.zazhi.pojo.entity.Flood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FloodMapper {

    /**
     * 根据经纬度查询附近的水灾信息
     *
     * @param nearByFloodDTO
     * @return
     */
    List<Flood> findNearbyFloods(NearbyFloodDTO nearByFloodDTO);
}
