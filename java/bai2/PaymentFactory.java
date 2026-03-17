/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

public class PaymentFactory {
    public static Payment getPayment(String type) {
        switch (type.toLowerCase()) {
            case "credit":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "cash":
                return new CashPayment();
            default:
                throw new IllegalArgumentException("Loại thanh toán không hợp lệ");
        }
    }
}