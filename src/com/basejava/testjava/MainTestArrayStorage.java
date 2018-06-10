package com.basejava.testjava;

import java.util.Arrays;

public class MainTestArrayStorage {

    public void ResumeAll() {
        ArrayStorage storage = new ArrayStorage();
        Resume resume1 = new Resume("1");
        Resume resume2 = new Resume("2");
        Resume resume3 = new Resume("3");
        Resume resume4 = new Resume("4");
//****************************
        System.out.println();
        System.out.print("SAVE(): ");
        System.out.println("В массиве: " + storage.size() + " резюме.");
        System.out.println("Добавление резюме " + resume1 + "...");
        storage.save(resume1);
        Resume[] S1tor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(S1tor));
        System.out.println();
//****************************
        System.out.print("SAVE(): ");
        System.out.println("В массиве: " + storage.size() + " резюме.");
        System.out.println("Добавление резюме " + resume2 + "...");
        storage.save(resume2);
        Resume[] S2tor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(S2tor));
        System.out.println();
//*****************************
        System.out.println();
        System.out.print("SAVE(): ");
        System.out.println("В массиве: " + storage.size() + " резюме.");
        System.out.println("Добавление резюме " + resume2 + "...");
        storage.save(resume2);
        Resume[] S3tor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(S3tor));
        System.out.println();
//*****************************
        System.out.print("GET(): ");
        System.out.println("Получение резюме " + resume3 + "...");
        storage.get("3");
        System.out.println();
//*****************************
        System.out.print("GET(): ");
        System.out.println("Получение резюме " + resume2 + "...");
        storage.get("2");
        System.out.println();
//*****************************
        System.out.print("UPDATE(): ");
        System.out.println("Обновление резюме " + resume4 + " на " + resume1 + "...");
        storage.update(resume4, resume1);
        Resume[] S4tor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(S4tor));
        System.out.println();
//*****************************
        System.out.print("UPDATE(): ");
        System.out.println("Обновление резюме " + resume1 + " на " + resume4 + "...");
        storage.update(resume1, resume4);
        Resume[] S5tor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(S5tor));
        System.out.println();
//*****************************
        System.out.print("DELETE(): ");
        System.out.println("Удаление резюме: " + resume1 + "...");
        storage.delete(resume1);
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] S6tor = storage.getAll();
        System.out.println("GET_ALL[элементы массива]: " + Arrays.toString(S6tor));
        System.out.println();
//*****************************
        System.out.print("DELETE(): ");
        System.out.println("Удаление резюме: " + resume4 + "...");
        storage.delete(resume4);
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] S7tor = storage.getAll();
        System.out.println("GET_ALL[элементы массива]: " + Arrays.toString(S7tor));
        System.out.println();
//*****************************
        System.out.print("CLEAR(): ");
        System.out.println("Очистка массива...");
        storage.clear();
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] S8tor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(S8tor));
        System.out.println();
//*****************************
    }
}
