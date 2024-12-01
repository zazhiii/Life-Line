package com.zazhi.controller;

import com.zazhi.pojo.entity.Landlide;
import com.zazhi.pojo.dto.LandslideRequest;
import com.zazhi.service.LandslideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/landslide")
public class LandslideController {

    private static final Logger logger = LoggerFactory.getLogger(EarthquakeController.class);

    @Autowired
    private LandslideService landslideService;

    @PostMapping
    public List<Landlide> getNearbyLocations(@RequestBody LandslideRequest request) {
        // 日志记录请求参数
        logger.info("Received request to get nearby landlides with latitude: {}, longitude: {}, radius: {}, year: {}",
                request.getLatitude(), request.getLongitude(), request.getRadius(), request.getYear());

        // 半径设置为可选
        double radius = request.getRadius();
        Integer year = request.getYear();

        // 调用服务层方法获取位置
        List<Landlide> landlides = landslideService.getNearbyLocations(request.getLatitude(), request.getLongitude(), radius, year);

        // 日志记录查询结果数量
        logger.info("Found {} landlides within {} meters radius and year {}", landlides.size(), radius, year);

        return landlides;
    }
}
