package com.liu.hellospringboot.request;

import lombok.Getter;
import lombok.Setter;

public class PackageSizeRequest extends RequestBase {

    @Getter
    @Setter
    private Double packageSize;
}
