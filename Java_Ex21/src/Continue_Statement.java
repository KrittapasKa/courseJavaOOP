/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class Continue_Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Set1
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }
        //Set2
//        Set2:
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (i == 2 && j == 2) {
////                    continue Set2;
//                    continue;
//                }
//                System.out.println(i + " " + j);
//            }
//        }
        //Set3        
//        int i = 1;
//        while (i <= 10) {
//            if (i == 6) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
        //Set4
        int i = 1;
        do {
            if (i == 98) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

}
