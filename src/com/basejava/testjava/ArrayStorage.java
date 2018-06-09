package com.basejava.testjava;

import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int countSize = 0;

    public void save(Resume resume) {

        if(countSize < 10000 && countSize >= 0) {
            storage[countSize] = resume;
            countSize++;
        }
    }

    public Resume get(String name) {
        for(int i = 0; i < countSize; i++) {
            if(storage[i].name.equals(name)) { return storage[i]; }
        }
        return null;
    }

    public void delete(Resume resume) {
        for(int i = 0; i < countSize; i++) {
            if(storage[i].equals(resume)) {
                storage[i] = storage[countSize - 1];
            }
        }
        countSize--;

    }
    public int size() {
        return countSize;
    }

    public void clear() {
        Arrays.fill(storage, 0, countSize - 1, null);
        countSize = 0;
    }

    Resume[] getAll() {
        if(countSize != 0) {
            Resume[] resArr = Arrays.copyOfRange(storage, 0, countSize);
            return resArr;
        } else {return null;}
    }


}
