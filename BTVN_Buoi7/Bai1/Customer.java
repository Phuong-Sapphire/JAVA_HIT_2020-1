/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author admini
 */
public class Customer extends Person{
    private int balance;

    public Customer(int balance) {
        this.balance = balance;
    }

    public Customer(int balance, String name, String address) {
        super(name, address);
        this.balance = balance;
    }
    @Override
    public void Display()
    {
        System.out.println("Customer Name: "+getName());
        System.out.println("Customer Address: "+getAddress());
        System.out.println("Customer Balance: "+balance);
    }
}
