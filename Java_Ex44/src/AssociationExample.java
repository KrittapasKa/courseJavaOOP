/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Association in Java (is a)
class Teacher {

    private String name;
    private String faculty;

    Teacher(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public String getTeacherName() {
        return this.name;
    }

    public String getTeacherFaculty() {
        return this.faculty;
    }
}

class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.name;
    }
}

public class AssociationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher teacher1 = new Teacher("Dr Kleed", "Computer Science");
        Student student1 = new Student("Krittapas");
        System.out.println(student1.getStudentName() + " is student of " + teacher1.getTeacherName()
                + " in the faculty of " + teacher1.getTeacherFaculty());
        Teacher teacher2 = new Teacher("Aj Pong", "Engineering");
        Student student2 = new Student("Nareesin");
        System.out.println(student2.getStudentName() + " is student of " + teacher2.getTeacherName()
                + " in the faculty of " + teacher2.getTeacherFaculty());
    }
}
