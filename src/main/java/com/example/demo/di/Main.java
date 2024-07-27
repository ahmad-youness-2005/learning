package com.example.demo.di;

public class Main {

    public static void main(String[] args) {
        DrawerInjectorImpl ahmadInjector = new DrawerInjectorImpl();
        Drawer drawer = new Drawer(ahmadInjector);
        drawer.draw();
    }

}
