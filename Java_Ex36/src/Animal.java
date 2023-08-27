/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kritt
 */
public abstract class Animal {

    String name;
    int age;

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    void setName(String n) {
        name = n;
    }

    void setAge(int a) {
        age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    abstract void makeNoise();
}
