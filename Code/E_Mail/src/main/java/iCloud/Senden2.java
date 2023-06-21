package iCloud;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;



public class Senden2 {
    public static void main(String[] args) {

        String host="smtp.mail.me.com";
        final String user="heiniluo@icloud.com";//change accordingly
        final String password="ohxk-mzzg-ywqd-sumn";//change accordingly

        String to="heiniluo@msn.com";//change accordingly

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true"); //mail.smtp.ssl.enable  //starttls
        props.put("mail.smtp.host ",host); //smtp.mail.me.com

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("heiniluo@icloud.com","ohxk-mzzg-ywqd-sumn");
            }
        };

        Session session = Session.getInstance(props,auth);

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Erster E-Mail Test");
            message.setText("This is simple program of sending email using JavaMail API");

            //send the message
            Transport.send(message);


            System.out.println("message sent successfully...");

        } catch (MessagingException e) {e.printStackTrace();}
    }//Ende Main
}//Ende Klasse
