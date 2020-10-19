package com.nghich.banned.base.helpers.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vertx.core.json.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonUtils {
    private static final Logger LOGGER = LogManager.getLogger(JsonUtils.class);

    private JsonUtils() {
        throw new IllegalStateException("Cannot create JsonUtils class.");
    }

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MAPPER.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        MAPPER.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
    }

    public static List<JsonObject> fileToListJsonObject(File file) {
        try {
            return MAPPER.readValue(file, new TypeReference<>() {
            });
        } catch (IOException e) {
            LOGGER.error(String.format("ERROR: read value file json %s fail!", file.getName()), e);
            return null;
        }
    }

    public static List<Object> fileToListObject(File file) throws IOException {
        return MAPPER.readValue(file, new TypeReference<>() {
        });
    }

    public static String convertToString(Object o) {
        try {
            return MAPPER.writeValueAsString(o);
        } catch (Exception e) {
            LOGGER.error(String.format("ERROR: convert object %s to String fail!", o.getClass()), e);
            return "";
        }
    }

    public static JsonObject objToMaskedJsonObj(Object o) {
        try {
            return new JsonObject(MAPPER.writeValueAsString(o));
        } catch (Exception e) {
            LOGGER.error(String.format("ERROR: convert object %s to JsonObject fail!", o.getClass()), e);
            return null;
        }
    }

    public static <T> T mapToObj(Map<String, String> map, Class<T> type) {
        return MAPPER.convertValue(map, type);
    }

    public static <T> T jsonToObj(JsonObject json, Class<T> type) {
        return jsonToObj(json.toString(), type);
    }

    public static <T> T jsonToObj(String object, Class<T> type) {
        try {
            return MAPPER.readValue(object, type);
        } catch (Exception e) {
            LOGGER.error(String.format("ERROR: convert json (From String) to object '%s' fail!", type.toString()), e);
            return null;
        }
    }


}
