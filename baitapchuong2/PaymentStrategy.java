/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong2;

/**
 *
 * @author longquan
 */
// Strategy
interface PaymentStrategy {
    void pay(int amount);
}

// Credit Card
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Thanh toán bằng Credit Card: " + amount);
    }
}

// PayPal
class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        strategy.pay(amount);
    }
}
