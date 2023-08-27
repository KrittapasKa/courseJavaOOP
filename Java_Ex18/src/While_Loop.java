/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class While_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        //Set1
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }
        //Set2
//        while (i <= 3) {
//            //loop of j
//            int j = 1;
//            while (j <= 3) {
//                System.out.println(i + " " + j);
//                j++;
//            }
//            i++;
//        }
        //Set3
        int row = 1;
        while (row <= 5) {
            int emptySpace = 6;
            while (emptySpace >= row) {
                System.out.print(" ");
                emptySpace--;
            }
            int star = 1;
            while (star <= (2 * row - 1)) {
                System.out.print("*");
                star++;
            }
            System.out.println("");
            row++;
        }
    }

}
