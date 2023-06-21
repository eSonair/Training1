package JavaBean;

import java.io.Serializable;

public class SimpleBean implements Serializable { //Unterschied zur normalen Klasse ist, dass es nur einen leeren CTOR u. Serializable hat.

    private int id, salary;
    private String name;


    public SimpleBean() {
    }

    public SimpleBean(int id, String name,  int salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}//Ende Klasse
