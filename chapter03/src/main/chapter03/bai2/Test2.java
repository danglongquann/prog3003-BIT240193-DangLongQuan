/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author longquan
 */
public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new NumberThread("Thread-" + i).start();
        }
    }
}