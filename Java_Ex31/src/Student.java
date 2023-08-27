/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Copy Constructor
public class Student {

    String id;
    String name;
    int age;
    double gpa;

    //Constructor
    Student(String i, String n, int a, double g) {
        id = i;
        name = n;
        age = a;
        gpa = g;
    }

    //Constructor to intializa another object
    Student(Student s) {
        id = s.id;
        name = s.name;
        age = s.age;
        gpa = s.gpa;
    }

    void Display() {
        System.out.println(id + " " + name + " " + age + " " + gpa);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std_obj1 = new Student("002", "Krittapas", 19, 3.91);
        Student std_obj2 = new Student(std_obj1);
        Student std_obj3 = new Student("001", "Thanawat", 24, 3.79);
        Student std_obj4 = new Student(std_obj3);
        std_obj1.Display();
        std_obj2.Display();
        std_obj3.Display();
        std_obj4.Display();
    }

}
