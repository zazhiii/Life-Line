package com.zazhi.service;

import com.zazhi.mapper.LandslideMapper;
import com.zazhi.pojo.dto.NearbyLandslideDTO;
import com.zazhi.pojo.entity.Landslide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandslideService {

    @Autowired
    LandslideMapper landslideMapper;

    /**
     * 获取附近滑坡信息
     *
     * @param nearbyLandslideDTO
     * @return
     */
    public List<Landslide> getNearbyLandslide(NearbyLandslideDTO nearbyLandslideDTO) {
        return landslideMapper.findNearbyLandslides(nearbyLandslideDTO);
    }
}
