package com.zazhi.mapper;

import com.zazhi.pojo.entity.Fire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FireMapper {

    @Select("SELECT * FROM fire WHERE " +
            "(#{radius} = 0 OR " +
            "6371 * 1000 * " + // Convert kilometers to meters
            "sqrt(power(sin((#{latitude} - FireLat) * pi() / 180 / 2), 2) + " +
            "cos(#{latitude} * pi() / 180) * cos(FireLat * pi() / 180) * " +
            "power(sin((#{longitude} - FireLon) * pi() / 180 / 2), 2)) <= #{radius}) " +
            "AND (substring(FireTime, 1, 4) = #{year} OR #{year} IS null)")
    List<Fire> findNearbyLocations(@Param("latitude") double latitude,
                                   @Param("longitude") double longitude,
                                   @Param("radius") double radius,
                                   @Param("year") Integer year);
}
