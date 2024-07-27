package com.example.demo.di;

import java.util.ArrayList;

public class DrawerInjectorImpl implements DrawerInjector{

    @Override
    public void inject(ArrayList<String> list) {

        list.remove(1);
        list.add(1, "********************");

        list.add(4, "\n");
        list.add(5, "Ahmad");
    }
}
