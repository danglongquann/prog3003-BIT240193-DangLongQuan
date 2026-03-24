/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapchuong2;

/**
 *
 * @author longquan
 */
public class Test {
    public static void main(String[] args) {

        // Bài 1
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db1.connect();

        // Bài 2
        Notification noti = NotificationFactory.createNotification("SMS");
        noti.notifyUser();

        // Bài 3
        HomeTheaterFacade home = new HomeTheaterFacade();
        home.watchMovie();

        // Bài 4
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(500);

        // Bài 5
        MessageService msg = new EmailService();
        msg.sendMessage("Hello World");
    }
}