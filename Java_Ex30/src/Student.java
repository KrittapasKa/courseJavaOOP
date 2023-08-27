/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Cpmstructor Oveerloading
public class Student {

    String id;
    String name;
    int age;
    double gpa;

    //Creting two Contructors
    Student(String i, String n) {
        id = i;
        name = n;
        Display();
    }

    Student(String i, String n, int a) {
        id = i;
        name = n;
        age = a;
        Display();
    }

    Student(String i, String n, int a, double g) {
        id = i;
        name = n;
        age = a;
        gpa = g;
        Display();
    }

    void Display() {
        System.out.println(id + " " + name + " " + age + " " + gpa);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std_obj1 = new Student("002", "Krittapas");
        Student std_obj2 = new Student("002", "Krittapas", 19);
        Student std_obj3 = new Student("002", "Krittapas", 19, 3.91);
    }

}
