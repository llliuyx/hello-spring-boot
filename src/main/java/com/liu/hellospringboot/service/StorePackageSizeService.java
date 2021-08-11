package com.liu.hellospringboot.service;

import com.liu.hellospringboot.entity.StorePackageSizeEntity;
import com.liu.hellospringboot.request.PackageSizeRequest;

import java.util.List;

public interface StorePackageSizeService {
    public List<StorePackageSizeEntity> getPackageSizes(String appName, String platform);

    public void addPackageSizes(PackageSizeRequest request);
}
