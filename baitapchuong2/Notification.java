/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong2;

/**
 *
 * @author longquan
 */
// Interface
interface Notification {
    void notifyUser();
}

// SMS
class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Gửi SMS");
    }
}

// Email
class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Gửi Email");
    }
}

// Factory
class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }
        return null;
    }
}
