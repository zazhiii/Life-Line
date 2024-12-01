package com.zazhi.controller;

import com.zazhi.pojo.dto.NearbyEarthquakeDTO;
import com.zazhi.pojo.entity.Earthquake;
import com.zazhi.pojo.result.Result;
import com.zazhi.service.EarthquakeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/earthquake")
@Tag(name = "地震", description = "地震 API")
public class EarthquakeController {

    private static final Logger log = LoggerFactory.getLogger(EarthquakeController.class);

    @Autowired
    private EarthquakeService earthquakeService;

    @PostMapping
    @Operation(summary = "获取最近地震", description = "根据年份和半径获取当前位置最近地震")
    public Result<List<Earthquake>> getNearbyEarthquakes(@RequestBody NearbyEarthquakeDTO nearbyEarthquakeDTO) {
        log.info("获取最近地震信息{}", nearbyEarthquakeDTO);
        return Result.success(earthquakeService.findNearbyEarthquakes(nearbyEarthquakeDTO));
    }

    @GetMapping
    @Operation(summary = "获取所有地震", description = "获取所有地震信息")
    public Result<List<Earthquake>> getAllEarthquakes() {
        log.info("获取所有地震信息");
        return Result.success(earthquakeService.findAllEarthquakes());
    }
}
