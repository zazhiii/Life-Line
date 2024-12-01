package com.zazhi.mapper;

import com.zazhi.pojo.dto.NearbyFireDTO;
import com.zazhi.pojo.entity.Fire;
import com.zazhi.pojo.result.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FireMapper {
    /**
     * 查询附近火灾
     * @param nearbyFireDTO
     * @return
     */
    List<Fire> findNearbyFires(NearbyFireDTO nearbyFireDTO);
}
