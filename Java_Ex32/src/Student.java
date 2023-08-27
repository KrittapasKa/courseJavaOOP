/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Coping Values without Constructor
public class Student {

    String id;
    String name;
    int age;

    Student(String i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    Student() {

    }

    void Display() {
        System.out.println(id + " " + name + " " + age);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std_obj1 = new Student("002", "Krittapas", 19);
        Student std_obj2 = new Student();
        std_obj2.id = std_obj1.id;
        std_obj2.name = std_obj1.name;
        std_obj2.age = std_obj1.age;
        std_obj1.Display();
        std_obj2.Display();
    }

}
