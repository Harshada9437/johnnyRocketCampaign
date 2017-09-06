/*
package com.bbq.util;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

*/
/**
 * Created by System-2 on 1/7/2017.
 *//*

public class Synchronize {
    public static JSONObject callCustomer(String myURL) throws JSONException {
        StringBuilder sb = new StringBuilder();
        InputStreamReader in = null;
        JSONObject jsonObj = null;

        try {
            URL url = new URL(myURL );
            URLConnection urlConn = url.openConnection();
            if (urlConn != null)
                urlConn.setReadTimeout(60 * 1000);
            if (urlConn != null && urlConn.getInputStream() != null) {
                in = new InputStreamReader(urlConn.getInputStream(),
                        Charset.defaultCharset());
                BufferedReader bufferedReader = new BufferedReader(in);
                if (bufferedReader != null) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        sb.append((char) cp);
                    }
                    bufferedReader.close();
                }
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:" + myURL, e);
        }

        if (sb != null) {
             jsonObj = new JSONObject(sb.toString());
        }
        return jsonObj;
    }
}

*/
