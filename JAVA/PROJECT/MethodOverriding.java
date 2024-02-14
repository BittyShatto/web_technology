import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;
        Teacher teacher = null;

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Enter Teacher Details");
            System.out.println("3. Display Student Details");
            System.out.println("4. Display Teacher Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Details:");
                    System.out.print("Name: ");
                    String studentName = scanner.next();
                    System.out.print("Age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    student = new Student(studentName, studentAge, rollNumber);
                    break;

                case 2:
                    System.out.println("Enter Teacher Details:");
                    System.out.print("Name: ");
                    String teacherName = scanner.next();
                    System.out.print("Age: ");
                    int teacherAge = scanner.nextInt();
                    System.out.print("Subject: ");
                    String subject = scanner.next();
                    teacher = new Teacher(teacherName, teacherAge, subject);
                    break;

                case 3:
                    if (student != null) {
                        System.out.println("\nStudent Details:");
                        student.displayDetails();
                    } 
                    else {
                        System.out.println("Student details not entered yet.");
                    }
                    break;

                case 4:
                    if (teacher != null) {
                        System.out.println("\nTeacher Details:");
                        teacher.displayDetails();
                    } 
                    else {
                        System.out.println("Teacher details not entered yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
