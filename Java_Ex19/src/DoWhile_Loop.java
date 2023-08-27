/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class DoWhile_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Set1
        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);
        //Set2
        //loop of j
//        do {
//            int j = 1;
//            do {
//                System.out.println(i + " " + j);
//                j++;
//            } while (j <= 3);
//            i++;
//        } while (i <= 3);
//        //Set3
        int row = 1;
        do {
            int emptySpace = 6;
            do {
                System.out.print(" ");
                emptySpace--;
            } while (emptySpace >= row);
            int star = 1;
            do {
                System.out.print("*");
                star++;
            } while (star <= (2 * row - 1));
            System.out.println("");
            row++;
        } while (row <= 5);
    }

}
