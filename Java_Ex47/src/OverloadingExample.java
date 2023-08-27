/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Static Polymorphism in java (Method Overloding)
class Calculator {

    int multiplication(int operand1, int operand2) {
        return operand1 * operand2;
    }

    int multiplication(int operand1, int operand2, int operand3) {
        return operand1 * operand2 * operand3;
    }
}

public class OverloadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        System.out.println("Mutiplication of two operand is : " + cal.multiplication(7, 3));
        System.out.println("Mutiplication of three operand is : " + cal.multiplication(3, 10, 7));
    }

}
