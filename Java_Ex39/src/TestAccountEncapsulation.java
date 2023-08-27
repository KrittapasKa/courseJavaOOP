/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class TestAccountEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc = new Account();
        acc.setAccountNo(632090315);
        acc.setName("Krittapas Kaewsinchai");
        acc.setEmail("krittapas.ka@outlook.com");
        acc.setAmount(1000000000);
        System.out.println(acc.getAccountNo() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount()); 
    }
    
}
