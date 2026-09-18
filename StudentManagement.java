import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {


        while (true) {

            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("4. Exit");

            System.out.println();

            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudent();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Programme Ended...");
                    return;

                

                default:
                    System.err.println("Invalid Choice");

            }
        }

    }

    static Scanner sc = new Scanner(System.in);
    static Student student;

    public static void addStudent() {
        System.out.println("Enter Student Id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name");
        String name = sc.nextLine().toUpperCase();
        

        System.out.println("Enter the Course ");
        String course = sc.nextLine().toUpperCase();

        System.out.println("Enter the Roll");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Your Institution");
        String institution = sc.nextLine().toUpperCase();
        student = new Student(id, name, course, roll, age,institution);

        System.out.println("Student Added Sucessfully");

    }

    public static void viewStudent() {

        System.out.println("==== Student Management System ===");

        if (student == null) {
            System.err.println("No Student Fount");
        }

        else {
            student.displayStudent();
        }
    }

    static void updateStudent() {
        if (student == null) {
            System.err.println("Not Student Found !");
        }

        System.out.println("Enter the Id");
        int id = sc.nextInt();
        sc.nextLine();

        if (student.getId() == id) {

            System.out.println("Enter the Name");
            String name = sc.next();
            sc.nextLine();

            System.out.println("Enter the course");
            String course = sc.next();
            sc.nextLine();

            System.out.println("Enter the Roll");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Age");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter your Institution");
            String institution=sc.next();
            sc.nextLine();
              // Updated values
            student.setName(name);
            student.setCourse(course);
            student.setRoll(roll);
            student.setAge(age);
            student.setInstitution(institution);

            System.out.println("Student Updated Successfully");

        }

        else {
            System.err.println("UFF Student Not Found !");
        }

        

    }


    static void deleteStudent(){

        if(student==null){
            System.err.println("Not Found Any Student !");
        }
        System.out.println("Enter the Id of Stundent to Delete");
        int id= sc.nextInt();
        sc.nextLine();

        if(student.getId()==id){
            student=null;
            System.out.println("Student Deleted Successfully");
        }

        else{
            System.err.println("Student Not Found");
        }
    }

}

class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private int roll;
    private String institution;

    Student(int id, String name, String course, int roll, int age,String institution) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.roll = roll;
        this.age = age;
        this.institution=institution;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public String setCourse(String course) {
        return this.course = course;
    }

    public int getRoll() {
        return this.roll;
    }

    public int setRoll(int roll) {
        return this.roll = roll;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String getInstitution(){
        return this.institution;
    }

    public String setInstitution(String institution){
       return this.institution=institution;
    }

    public void displayStudent() {
        System.out.println("Id :-"+" " + id);
        System.out.println("Name :-"+" " + name);
        System.out.println("Course :-"+" " + course);
        System.out.println("Roll :-"+" " +roll);
        System.out.println("Age :-"+" " + age);
        System.out.println("Institution :-"+" "+institution);
    }
}
