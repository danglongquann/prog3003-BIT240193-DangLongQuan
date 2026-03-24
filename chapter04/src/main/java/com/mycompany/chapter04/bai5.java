/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter04;

/**
 *
 * @author longquan
 */
import java.util.function.*;

public class bai5{
    public static void main(String[] args) {

        Supplier<Double> supplier = () -> Math.random() * 100;

        Consumer<Double> consumer = n ->
                System.out.println("Số may mắn: " + n);

        Double num = supplier.get();
        consumer.accept(num);
    }
}