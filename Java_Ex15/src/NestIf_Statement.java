
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author kritt
 */
public class NestIf_Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Input Age : ");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.print("Input Weight : ");
            int weight = in.nextInt();
            if (weight > 60) {
                System.out.println("You are Good!");
            } else {
                System.out.println("You are Bad!");
            }
        } else {
            System.out.println("You Age < 18!");
        }
    }

}
