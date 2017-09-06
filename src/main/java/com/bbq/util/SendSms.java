package com.bbq.util;

/**
 * Created by System-2 on 1/23/2017.
 */

import com.bbq.config.ConfigProperties;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SendSms {
    //Your authentication key
    private final String authkey = ConfigProperties.authkey;
    //Sender ID,While using route4 sender id should be 6 characters long.
    private final String senderId = ConfigProperties.senderId;
    private final String campaign = ConfigProperties.campaign;
    //define route
    private final String route = "4";

    //Prepare Url
    private URLConnection myURLConnection = null;
    private URL myURL = null;
    private BufferedReader reader = null;

    //Send SMS API
    private String mainUrl = "https://control.msg91.com/api/sendhttp.php?";

    //Prepare parameter string
    private final StringBuilder sbPostData = new StringBuilder(mainUrl);

    public Boolean sendSMS(String mobiles, String message) {
        if (mobiles == null || mobiles.equals("")) {
            return false;
        }
        Boolean isProcessed = Boolean.FALSE;

        //encoding message
        String encoded_message = URLEncoder.encode(message);
        encoded_message = URLEncoder.encode(encoded_message);


        sbPostData.append("authkey=" + authkey);
        sbPostData.append("&mobiles=" + mobiles);
        sbPostData.append("&message=" + encoded_message);
        sbPostData.append("&route=" + route);
        sbPostData.append("&sender=" + senderId);
        sbPostData.append("&campaign=" + campaign);
        try {
            //final string
            mainUrl = sbPostData.toString();
            //prepare connection
            myURL = new URL(mainUrl);
            myURLConnection = myURL.openConnection();

            myURLConnection.connect();

            reader = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));

            String response;
            while ((response = reader.readLine()) != null) {
            }
            reader.close();

            isProcessed = Boolean.TRUE;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isProcessed;
    }

    public Boolean NewUserSignup(String mobiles, int otp) {
        String message = "Your verification code is "+otp+". Enter the code to get registered for a complimentary meal.";
        return sendSMS(mobiles, message);
    }

    public Boolean newRegistration(String name,String date,String time,String mobile,int persons) {
        String person;
        if(persons-1>0){
           person="+"+ (persons-1);
        }else
        {
            person="";
        }
        String message = "Hi, here's your invite for an unlimited complimentary meal at JR Manipal.\n" +
               name+person+", "+DateUtil.format(DateUtil.getTimeStampFromString(date),"dd/MM/yyyy")+", "+time+
                ". Experince the taste of real Americana & In return give us ur valuable feedback.";
        return sendSMS(mobile, message);
    }
}