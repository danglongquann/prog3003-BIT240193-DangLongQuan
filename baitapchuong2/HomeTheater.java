/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong2;

/**
 *
 * @author longquan
 */
class TV {
    public void on() {
        System.out.println("TV bật");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Loa bật");
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD bật");
    }
}

// Facade
class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;

    public HomeTheaterFacade() {
        tv = new TV();
        sound = new SoundSystem();
        dvd = new DVDPlayer();
    }

    public void watchMovie() {
        System.out.println("Chuẩn bị xem phim...");
        tv.on();
        sound.on();
        dvd.on();
        System.out.println("Phim bắt đầu!");
    }
}