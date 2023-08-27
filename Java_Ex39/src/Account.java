/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kritt
 */
public class Account {

    //private data members
    private float accountNo;
    private String name, email;
    private float amount;

    //publoc getter and setter method
    public float getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(float accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
}
