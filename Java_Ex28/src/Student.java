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

    //Method to display the value of id,name,age
    void Display() {
        System.out.println(id + " " + name + " " + age);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating Object
        Student std_obj1 = new Student();
        Student std_obj2 = new Student();
        //Calling Display Method
        std_obj1.Display();
        std_obj2.Display();
    }

}
