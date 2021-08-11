package com.liu.hellospringboot.request;

import lombok.Getter;
import lombok.Setter;

public class RequestBase {
    @Getter
    @Setter
    private String appName;

    @Getter
    @Setter
    private String appVersion;

    @Getter
    @Setter
    private String platform;

    @Getter
    @Setter
    private Double packageSize;

    @Getter
    @Setter
    private String phoneModel;

    @Getter
    @Setter
    private String dt;
}
