/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;
import java.util.concurrent.*;

public class main {

    public static void main(String[] args) {

        CompletableFuture<Boolean> auth =
                CompletableFuture.supplyAsync(() -> authenticate());

        CompletableFuture<Boolean> balance =
                CompletableFuture.supplyAsync(() -> checkBalance());

        auth.thenCombine(balance, (a, b) -> {
            if (!a || !b) {
                throw new RuntimeException("Giao dịch thất bại!");
            }
            return true;
        }).thenAccept(result -> transfer())
          .exceptionally(ex -> {
              System.out.println("Lỗi: " + ex.getMessage());
              return null;
          });

        sleep(5000); // đợi async chạy xong
    }

    static boolean authenticate() {
        sleep(1000);
        System.out.println("✔ Xác thực OK");
        return true;
    }

    static boolean checkBalance() {
        sleep(1500);
        System.out.println("✔ Đủ số dư");
        return true;
    }

    static void transfer() {
        sleep(2000);
        System.out.println("✔ Chuyển tiền thành công");
    }

    static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}