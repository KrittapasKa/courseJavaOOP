/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class Scores {

    int Mathematics;
    int Programing;
    int English;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scores win = new Scores();
        win.Mathematics = 81;
        win.Programing = 97;
        win.English = 70;
        Scores mark = new Scores();
        mark.Mathematics = 85;
        mark.Programing = 70;
        mark.English = 75;
        System.out.println("Scores win : ");
        System.out.println("Mathematics : " + win.Mathematics);
        System.out.println("Programing : " + win.Programing);
        System.out.println("English : " + win.English + "\n");
        System.out.println("Scores mark : ");
        System.out.println("Mathematics : " + mark.Mathematics);
        System.out.println("Programing : " + mark.Programing);
        System.out.println("English : " + mark.English);
    }

}
