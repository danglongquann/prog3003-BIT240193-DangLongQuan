/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello via Email!");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello via SMS!");
    }
}