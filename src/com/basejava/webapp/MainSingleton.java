package com.basejava.webapp;

import com.basejava.webapp.model.SectionType;

public class MainSingleton {
    private static MainSingleton instance;

    public static MainSingleton getInstance() {
        if(instance == null) {
            instance = new MainSingleton();
        }
        return instance;
    }

    private MainSingleton() {
    }

    public static void main(String[] args) {
        MainSingleton.getInstance().toString();
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance.ordinal());
        for(SectionType type : SectionType.values()) {
            System.out.println(type.getTitle());
        }
    }

    public enum Singleton {
        INSTANCE
    }
}
