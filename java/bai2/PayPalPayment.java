/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

public class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal");
    }
}