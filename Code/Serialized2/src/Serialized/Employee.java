package Serialized;

import java.io.*;

public class Employee implements Serializable {

    //Das ist d. Zwischenversion v. "Serialized" u. "Deserialized" Version.
    private static final long serialVersionUID=129348279L;
    //Wenn man beim Serialisieren etwas nicht haben will schreibt man "transient" dazu
    transient int a;
    static int b;
    String name;
    int age;

    public Employee( String name,int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b=b;
    }
}//Ende Klasse
