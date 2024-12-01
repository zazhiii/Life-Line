package com.zazhi.controller;

import com.zazhi.pojo.entity.Landslide;
import com.zazhi.pojo.dto.NearbyLandslideDTO;
import com.zazhi.pojo.result.Result;
import com.zazhi.service.LandslideService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/landslide")
@Tag(name = "滑坡")
public class LandslideController {

    private static final Logger logger = LoggerFactory.getLogger(EarthquakeController.class);

    @Autowired
    private LandslideService landslideService;

    @PostMapping
    @Operation(summary = "获取附近滑坡信息")
    public Result<List<Landslide>> getNearbyLandslide(@RequestBody NearbyLandslideDTO nearbyLandslideDTO) {
        logger.info("获取附近滑坡信息");
        return Result.success(landslideService.getNearbyLandslide(nearbyLandslideDTO));
    }
}
