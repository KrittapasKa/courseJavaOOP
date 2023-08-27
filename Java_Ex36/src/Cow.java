/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class Cow extends Animal{
    Cow(String n,int a){
        super(n,a);
    }
    @Override
    void makeNoise(){
        System.out.println("Moooooooooooooo");
    }
}
