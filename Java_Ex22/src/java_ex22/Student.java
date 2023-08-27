/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_ex22;

/**
 *
 * @author kritt
 */
public class Student {

    String id;
    String name;
    int age;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating Onject Student
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        //student1 Pringting values object
        student1.id = "001";
        student1.name = "Mark";
        student1.age = 18;
        //student2 Pringting values object
        student2.id = "002";
        student2.name = "Sanid";
        student2.age = 18;
        //student3 Pringting values object
        student3.id = "003";
        student3.name = "win";
        student3.age = 18;
        System.out.println(student1.id + " " + student1.name + " " + student1.age);
        System.out.println(student2.id + " " + student2.name + " " + student2.age);
        System.out.println(student3.id + " " + student3.name + " " + student3.age);

    }

}
