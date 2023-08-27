/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Non primitive
import java.util.Scanner;

public class StringCharArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String text1 = "Java Programming";
        char[] ch = {'w', 'i', 'n'};
        String text2 = new String(ch);
        System.out.print("Input Text3 : ");
        String text3 = in.nextLine(); //เมื่อเว้นวรรคจะไม่เอาหลังจากเว้นวรรคห
        System.out.print("Input Text4 : ");
        String text4 = in.nextLine();//เอาข้อมูลทั้งหมด
        System.out.println("Text1 : " + text1 + '\n' + "Text2 : " + text2 + "\n" + "Text3 : " + text3 + "\n" + "Text4 : " + text4);
    }

}
