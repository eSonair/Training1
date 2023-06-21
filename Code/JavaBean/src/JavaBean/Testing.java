package JavaBean;

public class Testing {
    public static void main(String[] args) {

        SimpleBean a = new SimpleBean(1, "Test", 10000);
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getSalary());

        SimpleBean b = new SimpleBean();
        b.setId(2);
        b.setName("Franz");
        b.setSalary(4000);

    }//Ende Main
}//Ende Klasse
