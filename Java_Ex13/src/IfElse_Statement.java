/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class IfElse_Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 90;
        if(number % 2 == 0){
            System.out.println("Number is even number");
        }else{
                System.out.println("Number is odd number");
        }
        String output = (number%2 ==0)?"Even Number":"Odd Number";
        System.out.println(output);
    }
    
}
