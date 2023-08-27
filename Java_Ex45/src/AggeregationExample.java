/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Aggeregation in Java
class Address {

    String houseNum;
    String street;
    String city;
    String province;
    String country;
    int zipcode;

    Address(String h, String s, String c, String p, String ct, int z) {
        houseNum = h;
        street = s;
        city = c;
        province = p;
        country = ct;
        zipcode = z;
    }
}

class Student {

    int studentID;
    String studentName;
    //Creating Has-a relationship with Address
    Address studentAddress;

    Student(int studentID, String studentName, Address studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
}

public class AggeregationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Address student1_addr = new Address("2281", "Khunphan", "Mueang", "Suphanburi", "Thailand", 72000);
        //Aggregation --> student1_addr
        Student student1 = new Student(663090302, "Krittapas", student1_addr);
        System.out.println(student1.studentID + " " + student1.studentName + " "
                + student1.studentAddress.houseNum + " " + student1.studentAddress.street 
                + " " +  student1.studentAddress.city + " " +  student1.studentAddress.city + " " 
                +  student1.studentAddress.province + " " +  student1.studentAddress.country + " " +  student1.studentAddress.zipcode);
        
          Address student2_addr = new Address("780", "Bangpla", "Bangplama", "Suphanburi", "Thailand", 72000);
        //Aggregation --> student1_addr
        Student student2 = new Student(633090301, "Thanawat", student1_addr);
        System.out.println(student2.studentID + " " + student2.studentName + " "
                + student2.studentAddress.houseNum + " " + student2.studentAddress.street 
                + " " +  student2.studentAddress.city + " " +  student2.studentAddress.city + " " 
                +  student2.studentAddress.province + " " +  student2.studentAddress.country + " " +  student2.studentAddress.zipcode);
    }

}
