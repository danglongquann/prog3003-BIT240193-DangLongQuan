/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;

public class main {
    static ArrayList<student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showList();
                case 3 -> searchByName();
                case 4 -> deleteByMSSV();
                case 0 -> System.exit(0);
                default -> System.out.println("Sai lựa chọn!");
            }
        }
    }

    static void addStudent() {
        System.out.print("MSSV: ");
        String id = sc.nextLine();
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new student(id, name, gpa));
    }

    static void showList() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            list.forEach(System.out::println);
        }
    }

    static void searchByName() {
        System.out.print("Nhập tên: ");
        String key = sc.nextLine();

        list.stream()
            .filter(s -> s.getName().toLowerCase().contains(key.toLowerCase()))
            .forEach(System.out::println);
    }

    static void deleteByMSSV() {
        System.out.print("Nhập MSSV cần xóa: ");
        String id = sc.nextLine();

        boolean removed = list.removeIf(s -> s.getMssv().equals(id));

        if (removed) System.out.println("Đã xóa!");
        else System.out.println("Không tìm thấy!");
    }
}