package com.bbq.util;

import com.bbq.config.ConfigProperties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.SQLException;
import java.util.Properties;

public class EmailService {
        private static final String USERNAME = ConfigProperties.smtp_name;
        private static final String PASSWORD = ConfigProperties.smtp_password;
        private static final String HOST = ConfigProperties.smtp_host;
        private static final String FROM = ConfigProperties.smtp_from;
        private static final Session session = getSession();

    private static Session getSession() {
        if (session == null) {
            Properties props = new Properties();

            String MAIL_SMTP_CONNECTIONTIMEOUT ="mail.smtp.connectiontimeout";
            String MAIL_SMTP_TIMEOUT = "mail.smtp.timeout";
            String MAIL_SMTP_WRITETIMEOUT = "mail.smtp.writetimeout";
            String MAIL_SOCKET_TIMEOUT = "60000";
            props.put(MAIL_SMTP_CONNECTIONTIMEOUT, MAIL_SOCKET_TIMEOUT);
            props.put(MAIL_SMTP_TIMEOUT, MAIL_SOCKET_TIMEOUT);
            props.put(MAIL_SMTP_WRITETIMEOUT, MAIL_SOCKET_TIMEOUT);

            props.put("mail.smtp.host", HOST);
            /*props.put("mail.smtp.socketFactory.port", PORT);
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");*/
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", ConfigProperties.smtp_port);
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
            //java.security.Security.setProperty("networkaddress.cache.ttl","10");

            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(USERNAME,
                                    PASSWORD);
                        }
                    });
            return session;
        } else {
            return session;
        }
    }
    public static Boolean newRegistration(String to, String name,String date,String time,int persons)  {
        Boolean isProcessed;

        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(FROM));

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            message.setSubject("Invitation for an unlimited complimentary meal.");
            message.setText( "Hi "+name+",\n" +
                    "Here's your invite for an unlimited complimentary meal at Johnny Rockets Manipal Experience the taste of real Americana & In return give us your valuable" +
                    " feedback about the food, service and ambience. \n\n" +
                    "Your registration details :-\n"+
                    "\nName: "+ name + "\n"+
                    "Date: "+ DateUtil.format(DateUtil.getTimeStampFromString(date),"dd-MM-yyyy") + "\n"+
                    "Time: "+ time + "\n"+
                    "Number of person: "+ persons + "\n\n"+
                    "Thank You,\n" +
                    "Johnny Rockets Family");
            Transport.send(message);

            isProcessed = Boolean.TRUE;

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return isProcessed;
    }
}
