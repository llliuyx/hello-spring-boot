package com.liu.hellospringboot.controller;

import com.liu.hellospringboot.entity.StorePackageSizeEntity;
import com.liu.hellospringboot.request.PackageSizeRequest;
import com.liu.hellospringboot.utils.Result;
import com.liu.hellospringboot.service.StorePackageSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StorePackageSizeController {

    @Autowired
    private StorePackageSizeService storePackageSizeService;

    @GetMapping("/appstore/package")
    public Result appstorePackageSize(@RequestParam String appName, @RequestParam String platform) {
        List<StorePackageSizeEntity> storePackageSizes = storePackageSizeService.getPackageSizes(appName, platform);

        return Result.success(storePackageSizes);
    }

    @PostMapping(value = "/appstore/package")
    public Result addPackageSize(@RequestBody PackageSizeRequest request) {
        try {
            storePackageSizeService.addPackageSizes(request);
            return Result.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(e.toString());
        }
    }
}
