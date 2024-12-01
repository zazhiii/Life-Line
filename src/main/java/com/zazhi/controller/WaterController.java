package com.zazhi.controller;

import com.zazhi.pojo.dto.WaterRequest;
import com.zazhi.pojo.entity.Floor;
import com.zazhi.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/Floor")
public class WaterController {

    private static final Logger logger = LoggerFactory.getLogger(WaterController.class);

    @Autowired
    private WaterService waterService;

    @PostMapping
    public List<Floor> getNearbyWaters(@RequestBody WaterRequest request) {
        // 日志记录请求参数
        logger.info("Received request to get nearby fires with latitude: {}, longitude: {}, radius: {}, year: {}",
                request.getLatitude(), request.getLongitude(), request.getRadius(), request.getYear());

        // 获取请求参数
        double latitude = request.getLatitude();
        double longitude = request.getLongitude();
        double radius = request.getRadius();
        Integer year = request.getYear();

        // 调用服务层方法获取位置
        List<Floor> waters = waterService.findNearbyWaters(latitude, longitude, radius, year);

        // 日志记录查询结果数量
        logger.info("Found {} fires within {} meters radius and year {}", waters.size(), radius, year);

        return waters;
    }
}
