package com.basejava.webapp;


import com.basejava.webapp.model.Resume;
import com.basejava.webapp.storage.SortedArrayStorage;
import com.basejava.webapp.storage.Storage;

/**
 * Test com.basejava.webapp.storage;
 */
public class MainTestArrayStorage {
    private static final Storage ARRAY_STORAGE = new SortedArrayStorage();

    public static void main(String[] args) {

        Resume r1 = new Resume("uuid1","Name1" );
        Resume r2 = new Resume("uuid2", "Name2");
        Resume r3 = new Resume("uuid4","Name3" );
        Resume r4 = new Resume("uuid3", "Name4");
        Resume r5 = new Resume("uuid5", "Name5");
        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);
        ARRAY_STORAGE.save(r4);
        printAll();
        System.out.println("Size: " + ARRAY_STORAGE.size());
        System.out.println();
        ARRAY_STORAGE.save(r2);
        printAll();
        System.out.println();

        System.out.println("Get uuid1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));
        System.out.println();

        ARRAY_STORAGE.update(r2);
        ARRAY_STORAGE.update(r5);
        System.out.println();
        printAll();
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();
        ARRAY_STORAGE.delete(r5.getUuid());
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.print("GET ALL: ");
        System.out.print("[ ");
        for(Resume r : ARRAY_STORAGE.getAllSorted()) {
            System.out.print(r + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}