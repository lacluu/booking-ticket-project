package com.nghich.banned.clone.properties;

import com.nghich.banned.base.helpers.properties.PropertiesHelper;

import java.util.Properties;

public class PropertiesModuleClone {
    private PropertiesModuleClone() {
        throw new IllegalStateException("Cannot create PropertiesModuleClone class.");
    }

    public static final Properties cloneProperties;

    static {
        cloneProperties = PropertiesHelper.loadFileProperty("properties", "booking-ticket-clone.properties");
    }


}
