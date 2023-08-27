/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
interface Animal {

    public void animalSound();

    public void Sleep();
}

class Bird implements Animal {

    public void animalSound() {
        System.out.println("Jib Jib Jib");
    }

    public void Sleep() {
        System.out.println("Zzz.....");
    }
}

public class TestInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird = new Bird();
        bird.animalSound();
        bird.Sleep();
    }

}
