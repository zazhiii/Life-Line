package com.zazhi.service;

import com.zazhi.mapper.EarthquakeMapper;
import com.zazhi.pojo.dto.NearbyEarthquakeDTO;
import com.zazhi.pojo.entity.Earthquake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarthquakeService {

    @Autowired
    EarthquakeMapper earthquakeMapper;

    public List<Earthquake> findNearbyEarthquakes(NearbyEarthquakeDTO nearbyEarthquakeDTO) {
        return earthquakeMapper.findNearbyEarthquake(nearbyEarthquakeDTO);
    }

    /**
     * 获取所有地震的服务方法。
     *
     * @return 所有地震的列表
     */
    public List<Earthquake> findAllEarthquakes() {
            return earthquakeMapper.findAllEarthquakes();
    }
}
