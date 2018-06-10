package com.basejava.testjava;

import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int countSize = 0;

    public void update(Resume resume) {
        for(int i = 0; i < countSize; i++) {
            if(storage[i].uuid.equals(resume.uuid)) {
                storage[i] = resume;
                System.out.println(resume + " резюме обновлено.");
                break;
            }
            if(i == countSize - 1) {System.out.println(resume.uuid + " резюме не существует.");}
        }
    }

    public void save(Resume resume) {
        if(countSize < 1000) {
            if(Arrays.asList(storage).contains(resume)) {
                System.out.println("Добавление " + resume + " не возможно. Это резюме уже существует.");
            } else {
                storage[countSize] = resume;
                countSize++;
                System.out.println("Резюме " + resume + " добавлено.");
            }
        } else { System.out.println("Resume can't add to array. Array is full."); }
    }

    public Resume get(String uuid) {

        for(int i = 0; i < countSize; i++) {
            if(storage[i].uuid.equals(uuid)) {
                System.out.println("Резюме " + uuid + " получено.");
                return storage[i];
            }
        }
        System.out.println("Получение резюме " + uuid + " невозможно. Это резюме не существует.");
        return null;
    }

    public void delete(String uuid) {

        for(int i = 0; i < countSize; i++) {
            if(storage[i].uuid.equals(uuid)) {
                storage[i] = storage[countSize - 1];
                storage[countSize - 1] = null;
                countSize--;
                System.out.println("Резюме " + uuid + " удалено.");
                break;
            }
            if(i == countSize - 1) {
                System.out.println("Удаление " + uuid + " не возможно. Это резюме не существует.");
            }
        }
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
