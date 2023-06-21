package iCloud;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Senden3 {
    public static void main(String[] args) {
        Properties props;
        Session session;
        MimeMessage message;

        props = new Properties();
        props.put("mail.smtp.host", "smtp.mail.me.com");
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", true);

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("heiniluo@icloud.com", "fxqz-stif-lini-qige");
            }
        };

        session = Session.getInstance(props, auth);

        try {

            InternetAddress[] recipients = new InternetAddress[2];
            recipients[0] = new InternetAddress("heiniluo@msn.com");
            recipients[1] = new InternetAddress("martin0100@gmx.at");
            //recipients[2] = new InternetAddress("recipient2@domainname.com");
            //recipients[3] = new InternetAddress("recipient3@somedomain.ch");
            //recipients[4] = new InternetAddress("recipient4@gtv.org");
            // ...

            message = new MimeMessage(session);
            message.setFrom(new InternetAddress("heiniluo@icloud.com"));
            message.addRecipients(Message.RecipientType.TO, recipients);
            message.setSubject("Java Mail");
            message.setText("Sry konnte nicht widerstehen dir per Java ne Mail zu schicken.");

            Transport.send(message);

            System.out.println("Email sent");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }//Ende Main
}//Ende Klasse
