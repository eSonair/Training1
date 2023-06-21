package Serialized;

import java.io.*;

public class SerialExample {

    public static void printData (Employee object1){
        System.out.println("name=" + object1.name);
        System.out.println("age=" + object1.age);
        System.out.println("a=" + object1.a);
        System.out.println("b=" + object1.b);
    }
    public static void main(String[] args) {
        Employee object = new Employee("ab", 20, 2, 100);

        //serialization
        try{
            FileOutputStream fos = new FileOutputStream("darwin.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);//wo soll d. Stream hingehen

            oos.writeObject(object);//das ist d. Serialisierungsbefehl. hier wird auch d. Stream gespeichert
            oos.close();
            fos.close();
            System.out.println("Object has been serialized: Data before Deserialization.");
            printData(object);
            object.b=2000;
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }


        //Deserialisierung
        object=null;
        try{
            FileInputStream file = new FileInputStream("darwin.out");
            ObjectInputStream in = new ObjectInputStream(file);//wo soll d. Stream hingehen
            object = (Employee)in.readObject();
            System.out.println("Object has been deserialized: Data after Deserialization.");
            printData(object);
            object.b=2000;
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("IOException is caught");
        }


    }//Ende Main
}//Ende Klasse
