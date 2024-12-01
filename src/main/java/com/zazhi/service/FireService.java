package com.zazhi.service;

import com.zazhi.mapper.FireMapper;
import com.zazhi.pojo.dto.NearbyFireDTO;
import com.zazhi.pojo.entity.Fire;
import com.zazhi.pojo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FireService {

    @Autowired
    FireMapper fireMapper;

    /**
     * 查询附近火灾
     *
     * @param nearbyFireDTO
     * @return
     */
    public List<Fire> findNearbyFires(NearbyFireDTO nearbyFireDTO) {
        return fireMapper.findNearbyFires(nearbyFireDTO);
    }
}
