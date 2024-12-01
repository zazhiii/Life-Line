package com.zazhi.controller;

import com.zazhi.pojo.entity.Fire;
import com.zazhi.pojo.dto.NearbyFireDTO;
import com.zazhi.pojo.result.Result;
import com.zazhi.service.FireService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/fire")
@Tag(name = "火灾", description = "火灾信息接口")
public class FireController {

    private static final Logger log = LoggerFactory.getLogger(FireController.class);

    @Autowired
    private FireService fireService;

    @PostMapping
    @Operation(summary = "获取附近火灾信息")
    public Result<List<Fire>> getNearbyFires(@RequestBody NearbyFireDTO nearbyFireDTO) {
        log.info("getNearbyFires: {}", nearbyFireDTO);
        return Result.success(fireService.findNearbyFires(nearbyFireDTO));
    }
}
