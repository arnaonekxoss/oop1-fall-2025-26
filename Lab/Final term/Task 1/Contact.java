class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
class Student {
    private String name;
    private Contact contact; 

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }
 public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + contact.getPhone());
        System.out.println("Email: " + contact.getEmail());
    }
    class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int size) {
        this.schoolName = schoolName;
        students = new Student[size];
    }
    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("School is full! Cannot add more students.");
        }
    }

    public void showStudents() {
        System.out.println("Students of " + schoolName);
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Contact c1 = new Contact("01371603422", "ankurarna8@gmail.com");
        Contact c2 = new Contact("01817603422", "ankurarna9@gmail.com");

        Student s1 = new Student("Aninda", c1);
        Student s2 = new Student("Arna", c2);

        School school = new School("AIUB School", 5);

        school.addStudent(s1);
        school.addStudent(s2);
        school.showStudents();
    }
}