/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Send Email: " + message);
    }
}