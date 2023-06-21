package iCloud;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


public class Senden {

    public static void main(String[] args) {

        String host="smtp.mail.me.com";//smtp.mail.me.com
        final String user="heiniluo@icloud.com";//change accordingly
        final String password="Nkilaoag5046344";//change accordingly
        String to = "heiniluo@msn.com";//change accordingly
        String from = "heiniluo@icloud.com";//change accordingly


        //Get the session object
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user,password);
                    }
                });



        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Testlauf mir eine E-Mail zu schicken");
            message.setText("Hello, this is example of sending email  ");

            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        }catch (MessagingException mex) {mex.printStackTrace();}

    }//Ende Main
}//Ende Klasse
