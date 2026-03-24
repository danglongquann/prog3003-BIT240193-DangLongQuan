/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter04;

/**
 *
 * @author longquan
 */
import java.util.*;

public class bai2 {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");

        Collections.sort(cities, (a, b) -> a.length() - b.length());

        System.out.println("Sắp xếp: " + cities);
    }
}