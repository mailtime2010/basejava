package com.basejava.testjava;

import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int countSize = 0;

    public void save(Resume resume) {

        if(countSize < 10000) {
            storage[countSize] = resume;
            countSize++;
        } else {System.out.println("Вы не можете добавить резюме. Массив полностью заполненен.");}
    }

    public Resume get(String name) {
        if(countSize != 0) {
            for(int i = 0; i < countSize; i++) {
                if(storage[i].name.equals(name)) { return storage[i]; }
            }
        }
        else System.out.println("Вы не можете получить резюме.Массив резюме пустой.");
        return null;
    }

    public void delete(Resume resume) {
       if(countSize !=0) {
           for(int i = 0; i < countSize; i++) {
               if(storage[i].equals(resume)) {
                   storage[i] = storage[countSize - 1];
                   storage[countSize - 1] = null;
                   countSize--;
                   break;
               }
           }
       } else System.out.println("Вы не можете удалить резюме.Массив резюме пустой.");
    }

    public int size() {
        return countSize;
    }

    public void clear() {
        Arrays.fill(storage, 0, countSize, null);
        countSize = 0;
    }

    Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, countSize);
    }


}
