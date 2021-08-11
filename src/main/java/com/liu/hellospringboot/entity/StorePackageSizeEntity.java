package com.liu.hellospringboot.entity;

import com.liu.hellospringboot.request.PackageSizeRequest;
import lombok.Getter;


public class StorePackageSizeEntity {

    @Getter
    private int id;

    @Getter
    private String appName;

    @Getter
    private String appVersion;

    @Getter
    private String platform;

    @Getter
    private String phoneModel;

    @Getter
    private Double packageSize;

    @Getter
    private String dt;

    public StorePackageSizeEntity(String appName, String appVersion, String platform, String phoneModel, Double packageSize, String dt) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.platform = platform;
        this.phoneModel = phoneModel;
        this.packageSize = packageSize;
        this.dt = dt;
    }

    public static StorePackageSizeEntity entity(PackageSizeRequest request) {
        return new StorePackageSizeEntity(request.getAppName(), request.getAppVersion(), request.getPlatform(), request.getPhoneModel(), request.getPackageSize(), request.getDt());
    }
}
