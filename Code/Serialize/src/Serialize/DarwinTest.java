package Serialize;

import java.io.*;

public class DarwinTest extends Darwin implements Serializable {

    int version = 66;
    contain con = new contain();

    public int getVersion(){
        return version;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Serialize
        FileOutputStream fos = new FileOutputStream("darwin.out"); //Hier sagen wir wo wir d. File finden wollen.
        ObjectOutputStream oos = new ObjectOutputStream(fos); //Hier wandeln wir es in ein anderes Objekt um, um dessen
        //Methoden verwenden zu können
        DarwinTest st = new DarwinTest();
        oos.writeObject(st); //kommt v. d. Klasse ObjectOutputStream speichert es in "darwin.out";
        //oos.write(77);
        oos.flush();
        oos.close();

        //Deserialize
        FileInputStream file = new FileInputStream("darwin.out");
        ObjectInputStream in = new ObjectInputStream(file);

        //Methode für deserialiszation
        DarwinTest object1 = (DarwinTest)in.readObject();
        in.close();
        file.close();
        System.out.println("Object has beed deserialized");
        System.out.println("Version:" + object1.darwinVersion);
        System.out.println("Version:" + object1.version);
    }
}//Ende Klasse
