package com.nghich.banned.clone.utils;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionUtils {

    public static HttpURLConnection getConnection(String urlString) throws Exception {
        URL url = new URL(urlString);
        return (HttpURLConnection) url.openConnection();
    }

}
