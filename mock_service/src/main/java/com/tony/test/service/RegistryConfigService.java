package com.tony.test.service;

import java.util.List;

import com.tony.test.mock.po.RegistryConfig;

public interface RegistryConfigService {
    List<RegistryConfig> selectRegistryConfig(RegistryConfig service);

    RegistryConfig selectRegistryConfigById(int id);

    int updateOrInsertRegistryConfig(RegistryConfig RegistryConfig);

    int deleteRegistryConfig(RegistryConfig RegistryConfig);
}
