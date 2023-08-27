/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
class Rectangle {

    int width;
    int length;

    void insert_input(int w, int l) {
        width = w;
        length = l;
    }

    void calculateArea() {
        System.out.println(width * length);
    }
}

public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rtg = new Rectangle();
        Rectangle rtg2 = new Rectangle();
        Rectangle rtg3 = new Rectangle();
        rtg.insert_input(5, 10);
        rtg.calculateArea();
        rtg2.insert_input(3, 5);
        rtg2.calculateArea();
        rtg3.insert_input(2, 100);
        rtg3.calculateArea();
    }

}
