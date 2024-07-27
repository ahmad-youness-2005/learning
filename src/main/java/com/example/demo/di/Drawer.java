package com.example.demo.di;

import java.util.ArrayList;

public class Drawer {

    private DrawerInjector drawerInjector;

    public Drawer(DrawerInjector drawerInjector) {
        this.drawerInjector = drawerInjector;
    }

    public void draw(){
        ArrayList<String> list = fillData();
        StringBuilder builder = arrayToStringBuilder(list);
        System.out.println(builder);
    }

    /**
     * This function convert array list to string builder
     * @param list
     * @return
     */
    private StringBuilder arrayToStringBuilder(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();
        for (String str : list) {
            builder.append(str);
        }
        return builder;
    }

    /**
     * This function fill in drawer data
     * @return
     */
    private ArrayList<String> fillData(){
        ArrayList<String> list = new ArrayList<>();
        list.add("\n");
        list.add("=====================");
        list.add("\n");
        list.add("=====================");
        list.add("\n");
        list.add("=====================");
        list.add("\n");
        list.add("=====================");
        list.add("\n");

        drawerInjector.inject(list);

        return list;
    }

}
