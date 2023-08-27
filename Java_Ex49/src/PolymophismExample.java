/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
class Person {

    String name;
    String bornPlace;
    int bornYear;

    public Person(String name, String bornPlace, int bornYear) {
        this.name = name;
        this.bornPlace = bornPlace;
        this.bornYear = bornYear;
    }

    public void introduce() {
        System.out.println("My name is " + name + " , " + '\n' + "I was born in " + bornPlace);
    }
}

class Teacher extends Person {

    String workFaculty;

    public Teacher(String name, String bornPlace, int bornYear, String workFaculty) {
        super(name, bornPlace, bornYear);
        this.workFaculty = workFaculty;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and work in " + workFaculty);
    }
}

class Student extends Person {

    String studyFaculty;

    public Student(String name, String bornPlace, int bornYear, String studyFaculty) {
        super(name, bornPlace, bornYear);
        this.studyFaculty = studyFaculty;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a student and study in " + studyFaculty);
    }
}

public class PolymophismExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Person person1 = new Person();
        Person person1, person2, person3;
        person1 = new Person("Marktid", "Ameri", 1996);
        person2 = new Teacher("Safa", "Marito", 2001, "CompterScience");
        person3 = new Student("Krittapas", "Bangkok", 2004, "ComputerProgrammer");
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }

}
