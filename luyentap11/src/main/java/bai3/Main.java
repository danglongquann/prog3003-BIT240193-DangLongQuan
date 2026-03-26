/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "An", 900),
                new Employee(2, "Binh", 1500),
                new Employee(3, "Cuong", 2000),
                new Employee(4, "Dung", 800)
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000)   // lọc
                .map(Employee::getName)              // lấy tên
                .sorted()                            // sort alpha
                .collect(Collectors.toList());       // gom list

        System.out.println(result);
    }
}