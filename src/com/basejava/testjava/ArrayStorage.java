package com.basejava.testjava;

import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int countSize = 0;

    public void update(Resume resume) {
        if(index(resume.uuid) != -1) {
            storage[index(resume.uuid)] = resume;
            System.out.println("Резюме " + resume + " обновлено.");
        } else {System.out.println("Резюме " + resume.uuid + " не существует.");}
    }

    public void save(Resume resume) {
        if(countSize < storage.length - 1) {
            if(index(resume.uuid) != -1) {
                System.out.println("Добавление " + resume + " не возможно. Это резюме уже существует.");
            } else {
                storage[countSize] = resume;
                countSize++;
                System.out.println("Резюме " + resume + " добавлено.");
            }
        } else { System.out.println("Resume can't add to array. Array is full."); }
    }

    public Resume get(String uuid) {
        if(index(uuid) != -1) {
            System.out.println("Резюме " + uuid + " получено.");
            return storage[index(uuid)];
        } else {
            System.out.println("Получение резюме " + uuid + " невозможно. Это резюме не существует.");
            return null;
        }
    }

    public void delete(String uuid) {
        if(index(uuid) != -1) {
            storage[index(uuid)] = storage[countSize - 1];
            storage[countSize - 1] = null;
            countSize--;
            System.out.println("Резюме " + uuid + " удалено.");
        } else {
            System.out.println("Удаление " + uuid + " не возможно. Это резюме не существует.");
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

    public int index(String uuid) {
        for(int i = 0; i <= countSize - 1; i++) {
            if(storage[i].uuid.equals(uuid)) { return i; }
        }
        return -1;
    }
}
