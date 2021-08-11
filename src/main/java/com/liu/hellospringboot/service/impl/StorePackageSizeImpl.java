package com.liu.hellospringboot.service.impl;

import com.liu.hellospringboot.entity.StorePackageSizeEntity;
import com.liu.hellospringboot.mapper.StorePackageSizeMapper;
import com.liu.hellospringboot.request.PackageSizeRequest;
import com.liu.hellospringboot.service.StorePackageSizeService;
import com.liu.hellospringboot.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorePackageSizeImpl implements StorePackageSizeService {

    @Autowired
    private StorePackageSizeMapper storePackageSizeMapper;

    @Override
    public List<StorePackageSizeEntity> getPackageSizes(String appName, String platform) {
        return storePackageSizeMapper.selectPackageSizeByParams(appName, platform);
    }

    @Override
    public void addPackageSizes(PackageSizeRequest request) {
        if (StringUtil.isEmpty(request.getAppName()) || StringUtil.isEmpty(request.getAppVersion()) || StringUtil.isEmpty(request.getPlatform())
            || StringUtil.isEmpty(request.getPhoneModel()) || StringUtil.isEmpty(request.getDt()) || request.getPackageSize() == null
        ) {
            throw new IllegalArgumentException("以下字段为必传字段：appName、appVersion、platform、phoneModel、dt、packageSize");
        }
        StorePackageSizeEntity entity = StorePackageSizeEntity.entity(request);
        storePackageSizeMapper.insertPackageSize(entity);
    }
}
