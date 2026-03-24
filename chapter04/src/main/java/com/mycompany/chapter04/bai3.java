/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter04;

/**
 *
 * @author longquan
 */
import java.util.function.Predicate;

public class bai3 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("4 chẵn? " + isEven.test(4));
        System.out.println("5 chẵn? " + isEven.test(5));
    }
}