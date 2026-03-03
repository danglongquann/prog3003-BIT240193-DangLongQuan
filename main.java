/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;
 import java.util.*;
               
public class main {
    public static void main(String[] args) {
         genericstudentmanager<student> manager = new genericstudentmanager<>(); 
         
        manager.add(new student("S01", "a", 3.8));
        manager.add(new student("S02", "b", 3.1));
        manager.add(new student("S03", "c", 3.5));
        manager.add(new student("S04", "d", 2.9));
    

        System.out.println("--- Danh sách sinh viên ban đầu ---");
        manager.getall().forEach(System.out::println);
    }       
    }
    