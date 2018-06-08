package com.basejava.testjava;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int countSize = 0;

    public void save(Resume resume) {

        for(int i = 0; i < 10000; i++) {
            if(storage[i] == null) {
                storage[i] = resume;
                countSize++;
                break;
            }
        }
    }

    public Resume get(String name) {
        Resume one = null;
        for(int i = 0; i < countSize; i++) {
            if(storage[i].name.equals(name)) { one = storage[i]; }
        }
        return one;
    }

    public void delete(Resume resume) {
        Resume[] resArr = new Resume[countSize];
        for(int i = 0; i < countSize; i++) {
            resArr[i] = storage[i];
        }
        for(int j = 0; j <= countSize - 1; j++) {
            if(resArr[j].equals(resume)) {
                System.arraycopy(resArr, j + 1, resArr, j, countSize - 1 - j);
            }
        }
        resArr[resArr.length - 1] = null;

        System.arraycopy(resArr, 0, storage, 0, resArr.length);
        countSize--;

    }
    public int size() {
        return countSize;
    }

    public void clear() {
        for(int i = 0; i < countSize; i++) {
            storage[i] = null;
        }
        countSize = 0;
    }

    Resume[] getAll() {
        Resume[] resArr = new Resume[countSize];
        System.arraycopy(storage, 0, resArr, 0, countSize);
        return resArr;

    }


}
