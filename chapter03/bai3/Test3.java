/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author longquan
 */
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
            // B1
            return Arrays.asList(1, 2, 5, 3, 100);
        })
        .thenApply(list -> {
            // B2: lọc số lẻ + sort
            return list.stream()
                    .filter(x -> x % 2 != 0)
                    .sorted()
                    .collect(Collectors.toList());
        })
        .thenApply(result -> {
            // B3: chuyển thành chuỗi
            return "Kết quả là: " + result;
        })
        .thenAccept(System.out::println); // B4

        // tránh main kết thúc sớm
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}