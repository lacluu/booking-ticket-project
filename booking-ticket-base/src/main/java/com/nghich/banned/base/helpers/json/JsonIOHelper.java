package com.nghich.banned.base.helpers.json;

import com.nghich.banned.base.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JsonIOHelper {

    private JsonIOHelper() {
        throw new IllegalStateException("Cannot create class JsonIOHelper.");
    }

    private static final Logger LOGGER = LogManager.getLogger(JsonIOHelper.class);

    public static File getFile(String filename) {
        return getFile(StringUtils.ROOT_PATH, filename);
    }

    public static File getFile(String path, String filename) {
        return Paths.get(StringUtils.ROOT_PATH, path, filename).toFile();
    }

    public static String readFileJson(String filename) {
        return readFileJson(StringUtils.ROOT_PATH, filename);
    }

    public static String readFileJson(String path, String fileName) {
        StringBuilder builder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(path, fileName))) {
            stream.forEach(builder::append);
        } catch (IOException e) {
            LOGGER.error(String.format("ERROR: read file json '%s' fail!", fileName), e);
            return null;
        }
        return builder.toString();
    }

    public static boolean writeFileJson(String fileName, String content) {
        return writeFileJson(StringUtils.ROOT_PATH + "\\" + "clone", fileName, content);
    }

    public static boolean writeFileJson(String path, String fileName, String content) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path, fileName))) {
            writer.write(content);
        } catch (IOException e) {
            LOGGER.error(String.format("ERROR: write file json '%s' fail!", fileName), e);
            return false;
        }
        return true;
    }
}
