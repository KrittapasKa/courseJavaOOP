/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
class Employee {

    String name;
    int age;
    float salary = 70000;
}
//Inheritance (is a) --> Generalization

public class Programmer extends Employee {

    int bonus = 300000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programmer employee1 = new Programmer();
        Programmer employee2 = new Programmer();
        Programmer employee3 = new Programmer();
        employee1.name = "Krittapas";
        employee1.age = 19;
        System.out.println("Programmer1 Information : " + employee1.name + "\nAge : " + employee1.age);
        System.out.println("Programmer1 Salary : " + employee1.salary);
        System.out.println("Programmer1 Bonus : " + employee1.bonus);
        employee2.name = "Thanawat";
        employee2.age = 24;
        System.out.println("Programmer2 Information : " + employee2.name + "\nAge : " + employee2.age);
        System.out.println("Programmer2 Salary : " + employee2.salary);
        System.out.println("Programmer2 Bonus : " + employee2.bonus);
        employee3.name = "Nareesin";
        employee3.age = 20;
        System.out.println("Programmer3 Information : " + employee3.name + "\nAge : " + employee3.age);
        System.out.println("Programmer3 Salary : " + employee3.salary);
        System.out.println("Programmer3 Bonus : " + employee3.bonus);
    }

}
