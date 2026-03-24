/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author longquan
 */
import java.util.concurrent.CompletableFuture;

public class Test4 {
    public static void main(String[] args) {
        CompletableFuture<Void> checkProduct = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(" Đã kiểm tra sản phẩm");
            } catch (Exception e) {}
        });
        CompletableFuture<Void> payment = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1500);
                System.out.println(" Thanh toán thành công");
            } catch (Exception e) {}
        });
        CompletableFuture<Void> shipping = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(" Đã vận chuyển đơn hàng");
            } catch (Exception e) {}
        });
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(
                checkProduct, payment, shipping
        );

        allTasks.thenRun(() -> {
            System.out.println(" Hoàn thành xử lý đơn hàng!");
        });
        try { Thread.sleep(3000); } catch (Exception e) {}
    }
}
