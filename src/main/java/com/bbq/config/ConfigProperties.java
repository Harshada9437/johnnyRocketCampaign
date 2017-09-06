package com.bbq.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    public static String db_host;
    public static String senderId;
    public static String campaign;
    public static String db_port;
    public static String db_name;
    public static String smtp_name;
    public static String smtp_host;
    public static String smtp_password;
    public static String smtp_port;
    public static String smtp_from;
    public static String db_username;
    public static String db_password;
    public static String authkey;

    public static String data_dir;
    public static String app_path;

    static {
        try {

            app_path = new File(System.getProperty("catalina.home") + "/webapps").getAbsolutePath();
            Properties prop = new Properties();
            File propertyFile = new File(app_path + "/bbq.properties");
            prop.load(new FileInputStream(propertyFile));

            data_dir = app_path + "/" + prop.getProperty("data_dir") + "/";
            db_username = prop.getProperty("db_username");
            db_password = prop.getProperty("db_password");
            db_host = prop.getProperty("db_host");
            db_port = prop.getProperty("db_port");
            db_name = prop.getProperty("db_name");
            smtp_host = prop.getProperty("smtp_host");
            smtp_from = prop.getProperty("smtp_from");
            smtp_name = prop.getProperty("smtp_name");
            smtp_port = prop.getProperty("smtp_port");
            smtp_password = prop.getProperty("smtp_password");
            authkey = prop.getProperty("authkey");
            senderId = prop.getProperty("senderId");
            campaign = prop.getProperty("campaign");

        } catch (IOException ex) {
         ex.printStackTrace();
        }
    }
}
