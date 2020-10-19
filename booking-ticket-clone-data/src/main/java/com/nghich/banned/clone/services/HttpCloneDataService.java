package com.nghich.banned.clone.services;

import com.nghich.banned.base.helpers.json.JsonIOHelper;
import com.nghich.banned.clone.properties.PropertiesModuleClone;
import com.nghich.banned.clone.utils.HttpUrlConnectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;

public class HttpCloneDataService {
    private static final Logger LOGGER = LogManager.getLogger(HttpCloneDataService.class);

    private static final String URL_TIX_VN = PropertiesModuleClone.cloneProperties.getProperty("clone.http.server");
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CINEMA_FILE_NAME = PropertiesModuleClone.cloneProperties.getProperty("clone.cinema.file.name");

    public void cloneDataCinemas() {
        try {
            HttpURLConnection connection = HttpUrlConnectionUtils.getConnection(URL_TIX_VN);

            String paramString = PropertiesModuleClone.cloneProperties.getProperty("clone.request.cinema");

            createConnectionToServerCloneData(connection, paramString, CONTENT_TYPE_JSON);

            String content = handleResultCloneFromServer(connection);

            JsonIOHelper.writeFileJson(CINEMA_FILE_NAME, content);

            LOGGER.info("Clone data cinema successfully!");
        } catch (Exception e) {
            LOGGER.error(String.format("ERROR: Cannot get connection to %s", URL_TIX_VN), e);
        }
    }

    public void cloneDataFilms() {
        try {
            HttpURLConnection connection = HttpUrlConnectionUtils.getConnection(URL_TIX_VN);

            String paramString = PropertiesModuleClone.cloneProperties.getProperty("clone.request.cinema");

            createConnectionToServerCloneData(connection, paramString, CONTENT_TYPE_JSON);

            String content = handleResultCloneFromServer(connection);

            JsonIOHelper.writeFileJson(CINEMA_FILE_NAME, content);

            LOGGER.info("Clone data films successfully!");
        } catch (Exception e) {
            LOGGER.error(String.format("ERROR: Cannot get connection to %s", URL_TIX_VN), e);
        }
    }

    private String handleResultCloneFromServer(HttpURLConnection connection) throws IOException {
        int status = connection.getResponseCode();
        StringBuilder content = new StringBuilder();
        Reader streamReader;

        if (status > 299) {
            //case fail request
            streamReader = new InputStreamReader(connection.getErrorStream());
            //todo lac.luu: write code send message to telegram for case cannot connect to server clone
        } else {
            streamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader in = new BufferedReader(streamReader);
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        }
        return content.toString();
    }

    private void createConnectionToServerCloneData(HttpURLConnection connection, String paramString, String contentType) throws IOException {
        connection.setRequestProperty("Content-Type", contentType);
        connection.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        out.writeBytes(paramString);
        out.flush();
        out.close();
    }
}
