package com.example.demo.design_pattern.singelton;

public class UserSingleton {
    private static UserSingleton instance;

    public String name;
    public String dob;
    public String token;

    private UserSingleton() {}

    public static UserSingleton getInstance() {
        if (instance == null) {
            instance = new UserSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Username: " + name + ", Dob: " + dob + ", Token: " + token;
    }
}
