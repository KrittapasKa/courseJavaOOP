/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
class Student {

    String id;
    String name;
    int age;

    void insertData(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void DisplayData() {
        System.out.println(id + " " + name + " " + age);
    }
}

public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.insertData("001", "win", 19);
        student2.insertData("002", "jab", 24);
        student3.insertData("003", "kaohom", 20);
        student1.DisplayData();
        student2.DisplayData();
        student3.DisplayData();

    }

}
