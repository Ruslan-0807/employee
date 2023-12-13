public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
    }
    public String info(){
       return String.format(this.firstName +" "+ this.lastName);
    }
}

