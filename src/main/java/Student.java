public class Student {
    private String lastname;
    private String firstname;
    private String age;

    public Student(String lastname, String firstname, String age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getAge() {
        return age;
    }

}