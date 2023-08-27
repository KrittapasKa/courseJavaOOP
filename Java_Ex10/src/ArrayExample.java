/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = {2, 7, 47};
        System.out.println(array1.length);
        System.out.println(array1[1]);
        String[] array2 = {"Java", "C#", "Python", "Dart"};
        System.out.println(array2.length);
        System.out.println(array2[2]);

        int[][] array3 = {{1, 2}, {3, 4}};
        System.out.println(array3.length);
        System.out.println(array3.length);
        System.out.println(array3[0][0]);
        System.out.println(array3[0][1]);
        System.out.println(array3[1][0]);
        System.out.println(array3[1][1]);

        byte[][][] array4 = new byte[3][3][3];
        array4[0][0][0] = 2;
        array4[1][1][1] = 7;
        array4[2][2][2] = 47;
        System.out.println(array4[0][0][0]);
        System.out.println(array4[1][1][1]);
        System.out.println(array4[2][2][2]);
    }

}
