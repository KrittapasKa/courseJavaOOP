/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Dynamic Polymrphism in java (method Overriding)
class Multiplication {

    int calculate(int operand1, int operand2) {
        return operand1 * operand2;
    }
}

class Division extends Multiplication {

    @Override
    int calculate(int operand1, int operand2) {
        return operand1 / operand2;
    }
}

public class OverridingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Multiplication mulcal = new Multiplication();
        System.out.println("Multiplication of two operand is " + mulcal.calculate(3, 10));
        Division divcal = new Division();
        System.out.println("Division of two operand is " + divcal.calculate(10, 5));
    }

}
