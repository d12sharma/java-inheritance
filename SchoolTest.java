// Superclass: Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("General person in the school");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher of subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Student in grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Staff member in department: " + department);
    }
}

// Testing the classes
public class SchoolTest {
    public static void main(String[] args) {
        Person teacher = new Teacher("Dhruv", 21, "Mathematics");
        Person student = new Student("madhav", 16, 10);
        Person staff = new Staff("Naam", 40, "Administration");

        Person[] people = {teacher, student, staff};
        for (Person person : people) {
            System.out.println("Name: " + person.name + ", Age: " + person.age);
            person.displayRole();
        }
    }
}
