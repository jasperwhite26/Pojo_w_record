public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;


    public Student(){
        studentId = "";
        firstName = "";
        lastName = "";
        age = 0;
        major = "";
    }

    public Student(String studentId, String firstName, String lastName, int age, String major){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Major: " + major;
    }
}


