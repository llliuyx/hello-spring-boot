package com.liu.hellospringboot.mapper;

import com.liu.hellospringboot.entity.StorePackageSizeEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorePackageSizeMapper {

    List<StorePackageSizeEntity> selectPackageSizeByParams(@Param("app_name") String appName, @Param("platform") String platform);

    void insertPackageSize(StorePackageSizeEntity packageSize);
}
