package com.basejava.webapp;

public class MainAutoClose {
    public static void main(String[] args) {
        class X implements AutoCloseable {
            private String name;

            public X(String name) {
                this.name = name;
                System.err.println("new: " + name);
            }

            @Override
            public void close() throws Exception {
                System.err.println("close: " + name);
            }
        }
        try(X x0 = new X("0"); X x1 = new X("1"); X x2 = new X("2")) {
            System.err.println("try");
            throw new Exception();
        } catch(Exception e) {
            System.err.println("catch");
        } finally {
            System.err.println("finally");
        }

    }
}
