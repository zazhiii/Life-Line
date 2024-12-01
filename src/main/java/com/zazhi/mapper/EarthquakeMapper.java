package com.zazhi.mapper;

import com.zazhi.pojo.dto.NearbyEarthquakeDTO;
import com.zazhi.pojo.entity.Earthquake;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EarthquakeMapper {


    /**
     * 获取所有地震信息
     * @return
     */
    @Select("SELECT * FROM earthquake")
    List<Earthquake> findAllEarthquakes();

    /**
     * 获取附近地震信息
     * @param nearbyEarthquakeDTO
     * @return
     */
    List<Earthquake> findNearbyEarthquake(NearbyEarthquakeDTO nearbyEarthquakeDTO);
}
