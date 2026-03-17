/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;
public class Main {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPayment("credit");
        p1.pay(1000);

        Payment p2 = PaymentFactory.getPayment("paypal");
        p2.pay(500);

        Payment p3 = PaymentFactory.getPayment("cash");
        p3.pay(200);
    }
}