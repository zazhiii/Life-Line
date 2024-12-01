package com.zazhi.mapper;

import com.zazhi.pojo.dto.NearbyLandslideDTO;
import com.zazhi.pojo.entity.Landslide;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LandslideMapper {

    List<Landslide> findNearbyLandslides(NearbyLandslideDTO nearbyLandslideDTO);
}
