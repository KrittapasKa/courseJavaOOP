/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
class AccountBank {

    int account_no;
    String name;
    float amount;

    //Method1
    void insertData(int account_no, String name, float amount) {
        this.account_no = account_no;
        this.name = name;
        this.amount = amount;
    }

    void deposit(float amount) {
        this.amount += amount;
        System.out.println("deposit : " + this.amount);
    }

    void withdraw(float amount) {
        if (this.amount < amount) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount -= amount;
            System.out.println("withdraw : " + this.amount);
        }
    }

    void checkBalance() {
        System.out.println("checkBalance : " + this.amount);
    }

    void Display() {
        System.out.println(account_no + " " + name + " " + amount);
    }

}

public class TestAccountBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccountBank acBank = new AccountBank();
        acBank.insertData(70066188, "Krittapas", 0);
        acBank.deposit(10000);
        acBank.withdraw(500);
        acBank.checkBalance();
        acBank.Display();
        AccountBank acBank2 = new AccountBank();
        acBank2.insertData(70011100, "Thanawat", 0);
        acBank2.deposit(300000);
        acBank2.withdraw(50000);
        acBank2.checkBalance();
        acBank2.Display();
    }

}
