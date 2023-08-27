/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
import java.util.Scanner;
public class TemperatureFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit : ");
        double fahrenheit  = in.nextDouble();
        double calsius = ((5*(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree fahrenheit is qual to " + calsius + " in calsius");
    }
    
}
