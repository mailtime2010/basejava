package com.basejava.webapp;

import java.io.*;

public class MainSerializer {
    public static void main(String[] args) {
        //serialization
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:\\serial"))) {
            MyClass object1 = new MyClass("Hello", 21.22, 5000);
            System.out.println("object1: " + object1);
            oos.writeObject(object1);
        } catch(Exception e) {
            System.out.println("Mistake serialization " + e);
        }
        //deserialization
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:\\serial"))) {
            MyClass object2 = (MyClass) ois.readObject();
            System.out.println("object2: " + object2);
        } catch(Exception e) {
            System.out.println("Mistake deserialization " + e);
            //System.exit(0);
        }
    }

    private static class MyClass implements Serializable {
        String str;
        double dv;
        int num;

        public MyClass(String str, double dv, int num) {
            this.str = str;
            this.dv = dv;
            this.num = num;
        }

        @Override
        public String toString() {
            return "str = " + str + "; dv = " + dv + "; num = " + num;
        }
    }
}
