
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author kritt
 */
public class IfElseIf_Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Input Score : ");
        int score = in.nextInt();
        if (score < 50) {
            System.out.println("Grade F");
        } else if (score > 50 && score < 55) {
            System.out.println("Grade D");
        } else if (score > 55 && score < 60) {
            System.out.println("Grade D+");
        } else if (score > 60 && score < 65) {
            System.out.println("Grade C");
        } else if (score > 65 && score < 70) {
            System.out.println("Grade C+");
        } else if (score > 70 && score < 75) {
            System.out.println("Grade B");
        } else if (score > 75 && score < 80) {
            System.out.println("Grade B+");
        } else if(score >80 && score < 100){
            System.out.println("Grade A");
        }else{
            System.out.println("Error Plese Fill score 1-100");
        }

    }

}
