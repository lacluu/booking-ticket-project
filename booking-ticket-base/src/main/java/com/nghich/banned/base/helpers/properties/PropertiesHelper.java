package com.nghich.banned.base.helpers.properties;

import com.nghich.banned.base.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHelper {

    private PropertiesHelper() {
        throw new IllegalStateException("Cannot create class PropertiesHelper.");
    }

    private static final Logger LOGGER = LogManager.getLogger(PropertiesHelper.class);

    public static Properties loadFileProperty(String path, String fileName) {
        Properties properties = new Properties();
        String fileLocation = StringUtils.ROOT_PATH + "\\" + path + "\\" + fileName;

        try {
            properties.load(new FileInputStream(fileLocation));
            return properties;
        } catch (IOException e) {
            LOGGER.error(String.format("ERROR: Load file properties %s fail!", fileLocation), e);
            return null;
        }
    }

}
