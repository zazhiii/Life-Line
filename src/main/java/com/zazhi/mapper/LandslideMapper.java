package com.zazhi.mapper;

import com.zazhi.pojo.entity.Landlide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LandslideMapper {

    @Select("SELECT * FROM landslide WHERE " +
            "(#{radius} = 0 OR " +
            "6371 * 1000 * " + // Convert kilometers to meters
            "sqrt(power(sin((#{latitude} - latitude) * pi() / 180 / 2), 2) + " +
            "cos(#{latitude} * pi() / 180) * cos(latitude * pi() / 180) * " +
            "power(sin((#{longitude} - longitude) * pi() / 180 / 2), 2)) <= #{radius})"+
            "AND (substring(evDate, 1, 4) = #{year} OR #{year} IS null)")
    List<Landlide> findNearbyLocations(@Param("latitude") double latitude,
                                       @Param("longitude") double longitude,
                                       @Param("radius") double radius,
                                       @Param("year") Integer year);
}
