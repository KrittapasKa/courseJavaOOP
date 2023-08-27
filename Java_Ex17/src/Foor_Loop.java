/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class Foor_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Set1
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//
//        }
        //Set2
        //loop of i
//        for (int i = 1; i <= 3; i++) {
//            //loop of j
//            for (int j = 1; j <= 3; j++) {
//                System.out.println(i + " " + j);
//            }//end of j
//        }
        //Set3
        for (int row = 1; row <= 5; row++) {
            for (int emptySpace = 6; emptySpace >= row; emptySpace--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
