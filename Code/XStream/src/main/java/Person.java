public class Person {
    private String firstname, lastname;

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public Person(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }
}
