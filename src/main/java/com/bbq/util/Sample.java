/*
package com.bbq.util;

import com.bbq.bo.request.NotifyRequestBO;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

*/
/**
 * Created by System-2 on 5/22/2017.
 *//*

public class Sample {
    public static Boolean sendPushNotification(NotifyRequestBO deviceToken)
            throws IOException, JSONException {

        final String AUTH_KEY_FCM = "AIzaSyCin9r28hY5IQanue_R7NJ_mxDevvpiV2k";
        final String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";


        Boolean result = Boolean.FALSE;
        URL url = new URL(API_URL_FCM);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "key=" + AUTH_KEY_FCM);
        conn.setRequestProperty("Content-Type", "application/json");

        JSONObject json = new JSONObject();
        JSONObject dataObj = new JSONObject();
        dataObj.put("title", deviceToken.getData().getTitle());
        dataObj.put("image", deviceToken.getData().getImage());
        dataObj.put("message", deviceToken.getData().getMessage());
        dataObj.put("timestamp", deviceToken.getData().getTimestamp());
        json.put("to", deviceToken.getTo());
        json.put("data", dataObj);

        try {
            OutputStreamWriter wr = new OutputStreamWriter(
                    conn.getOutputStream());
            wr.write(json.toString());
            wr.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            result = Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            result = Boolean.FALSE;
        }
        System.out.println("GCM Notification is sent successfully");

        return result;
    }
}
*/
