/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author longquan
 */
// Thread
class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

// Runnable
class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable đang chạy...");
    }
}

// Main
