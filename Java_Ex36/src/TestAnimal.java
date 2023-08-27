/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal dog = new Dog("Bao", 15);
        Animal cat = new Cat("Capushino", 7);
        Animal cow = new Cow("Milk", 24);
        Animal frog = new Frog("Robert", 2);
        dog.makeNoise();
        cat.makeNoise();
        cow.makeNoise();
        frog.makeNoise();
    }

}
