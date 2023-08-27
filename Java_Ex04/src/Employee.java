/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
class EmployeeTest {

    public static double salary;
    public static String name = "Krittapas";
}

public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeTest.salary = 70000;    
        System.out.println(EmployeeTest.name + " Saraly : " + EmployeeTest.salary);
    }

}
