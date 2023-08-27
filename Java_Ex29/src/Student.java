/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class Student {

    String id;
    String name;
    int age;

    //Creating a Parameterizerd Constructor
    Student(String i, String n, int a) {
        id = i;
        name = n;
        age = a;
        Display();
    }

    //Method to Display values
    void Display() {
        System.out.println(id + " " + name + " " + age);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st_obj1 = new Student("002", "Krittapas", 19);
        Student st_obj2 = new Student("001", "Thanawat", 24);
    }

}
