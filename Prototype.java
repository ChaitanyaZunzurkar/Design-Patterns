abstract class Person implements Cloneable {
    String name;
    int age;
    String department;

    public Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Student extends Person {
    String rollNo;
    String course;

    public Student(String name, int age, String department, String rollNo, String course) {
        super(name, age, department);
        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayStudent() {
        displayInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    @Override
    public Student clone() {
        return (Student) super.clone();
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String department, String subject, double salary) {
        super(name, age, department);
        this.subject = subject;
        this.salary = salary;
    }

    public void displayTeacher() {
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }

    @Override
    public Teacher clone() {
        return (Teacher) super.clone();
    }
}

public class Prototype {
    public static void main(String[] args) {
        Student studentPrototype = new Student("Default Student", 20, "CS", "ROLL123", "B.Tech");
        Teacher teacherPrototype = new Teacher("Default Teacher", 40, "CS", "DSA", 50000);

        Student student1 = studentPrototype.clone();
        student1.name = "Chaitanya";
        student1.rollNo = "CS2025";
        student1.course = "B.Tech CSE";

        Teacher teacher1 = teacherPrototype.clone();
        teacher1.name = "Prof. Sharma";
        teacher1.subject = "Data Structures";
        teacher1.salary = 60000;

        System.out.println("=== Student Details ===");
        student1.displayStudent();

        System.out.println("\n=== Teacher Details ===");
        teacher1.displayTeacher();
    }
}
