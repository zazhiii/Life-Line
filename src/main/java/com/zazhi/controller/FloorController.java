package com.zazhi.controller;

import com.zazhi.pojo.dto.NearbyFloorDTO;
import com.zazhi.pojo.entity.Floor;
import com.zazhi.pojo.result.Result;
import com.zazhi.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/floor")
public class FloorController {

    private static final Logger log = LoggerFactory.getLogger(FloorController.class);

    @Autowired
    private FloorService waterService;

    @PostMapping
    public Result<List<Floor>> getNearbyFloors(@RequestBody NearbyFloorDTO nearByFloorDTO) {
        log.info("getNearbyFloors: {}", nearByFloorDTO);
        return Result.success(waterService.findNearbyFloors(nearByFloorDTO));
    }
}
