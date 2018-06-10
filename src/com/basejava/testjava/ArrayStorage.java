package com.basejava.testjava;

import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int countSize = 0;

    public void update(Resume resumeDel, Resume resumeSet) {

        if(Arrays.asList(storage).contains(resumeSet)) {
            System.out.println("Добавление " + resumeSet + " не возможно. Это резюме уже существует.");
        } else {
            for(int i = 0; i < countSize; i++) {
                if(storage[i].equals(resumeDel)) {
                    storage[i] = resumeSet;
                    System.out.println(resumeDel + " Обновлено на " + resumeSet + '.');
                }
            }
        }
    }

    public void save(Resume resume) {

        if(Arrays.asList(storage).contains(resume)) {
            System.out.println("Добавление " + resume + " не возможно. Это резюме уже существует.");
        } else {
            storage[countSize] = resume;
            countSize++;
            System.out.println("Резюме " + resume + " добавлено.");
        }
    }

    public Resume get(String uuid) {

        for(int i = 0; i < countSize; i++) {
            if(storage[i].uuid.equals(uuid)) {
                System.out.println("Резюме " + uuid + " получено.");
                return storage[i]; }
        }
        System.out.println("Получение резюме "+ uuid +" невозможно. Это резюме не существует.");
        return null;
    }

    public void delete(Resume resume) {
        if(!(Arrays.asList(storage).contains(resume))) {
            System.out.println("Удаление " + resume + " не возможно. Это резюме не существует.");
        } else {
            for(int i = 0; i < countSize; i++) {
                if(storage[i].equals(resume)) {
                    storage[i] = storage[countSize - 1];
                    storage[countSize - 1] = null;
                    countSize--;
                    System.out.println("Резюме " + resume + " удалено.");
                    break;
                }
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
