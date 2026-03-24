/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong2;

/**
 *
 * @author longquan
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Constructor private
    private DatabaseConnection() {
        System.out.println("Kết nối database...");
    }

    // Hàm lấy instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Đã kết nối DB");
    }
}