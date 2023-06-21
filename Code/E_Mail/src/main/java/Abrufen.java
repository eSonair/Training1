import javax.mail.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Properties;

public class Abrufen {

    //Bei Gmail geht es nur mit Imap, andere bieten evtl. auch Pop 3 an.
    public static void main(String[] args) throws MessagingException, IOException {

        String host = "imap.gmail.com";
        String username="heiniluo34@gmail.com";
        String passwort="pvjeeuqhrblymumb";
        String protocol = "imaps";
        boolean debug = true;
        String url = null;

        //Eigenschaften f. d. Verbindung zum Mailserver
        Properties props = new Properties();
        props = System.getProperties();

        props.setProperty("mail.store.protocol", "imaps");
        System.out.println(props.toString());
        Session session = Session.getDefaultInstance(props, null);

        session.setDebug(debug);

        try{
            //Verbindung herstellen
            Store store;
            if(url!=null){
                URLName urln = new URLName(url);
                store = session.getStore(urln);
                System.out.println("Test.....");
                store.connect();
            }//Ende if
            else{
                store=session.getStore(protocol);
                if (host!=null|| username!=null||passwort!=null){
                    System.out.println("Verbindungsaufbau....");
                    store.connect(host, username, passwort);
                    System.out.println("Verbindung erfolgreich.");
                }//Ende if2
                else {
                    store.connect();
                }//Ende Else2
            }

            //Öffnen des Posteingangs
            Folder inbox;
            inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            int lastMessageCount = inbox.getMessageCount();
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Anzahl E-Mails: " + lastMessageCount);
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Anzahl E-Mails: " + lastMessageCount);
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Ungelesene E-Mails" + inbox.getUnreadMessageCount());
            Message [] newMessages = inbox.getMessages(inbox.getMessageCount()-10, inbox.getMessageCount());
            for (Message m : newMessages){
                System.out.println(m.getContentType());
                InputStream is = m.getInputStream();
                BufferedReader read = new BufferedReader(new InputStreamReader(is));
                String thisLine;
                String meldung="\n\n";

                while ((thisLine=read.readLine())!=null){
                    meldung = meldung+ "\n" + thisLine;
                }//Ende While
                System.out.println(meldung);
            }//Ende For

            store.close();
        }//Ende try
        catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }//Ende Main
}//Ende Klasse
