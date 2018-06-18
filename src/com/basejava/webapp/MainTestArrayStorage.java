package com.basejava.webapp;


import com.basejava.webapp.model.Resume;
import com.basejava.webapp.storage.ArrayStorage;
import com.basejava.webapp.storage.Storage;

/**
 * Test com.basejava.webapp.storage;
 */
public class MainTestArrayStorage {
    private static final Storage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) {

        Resume r1 = new Resume();
        r1.setUuid("uuid2");
        Resume r2 = new Resume();
        r2.setUuid("uuid3");
        Resume r3 = new Resume();
        r3.setUuid("uuid1");
        Resume r4 = new Resume();
        r4.setUuid("uuid4");
        Resume r5 = new Resume();
        r5.setUuid("uuid5");
        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);
        ARRAY_STORAGE.save(r4);
        ARRAY_STORAGE.save(r5);
        System.out.println("Size: " + ARRAY_STORAGE.size());
        System.out.println();

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));
        System.out.println();

        ARRAY_STORAGE.update(r2);
        ARRAY_STORAGE.update(r4);
        printAll();
        System.out.println();
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.println("\nGet All: ");
        for(Resume r : ARRAY_STORAGE.getAll()) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
}