package com.basejava.testjava;

import java.util.Arrays;

public class MainTestArrayStorage {

    public void ResumeAll() {
        ArrayStorage storage = new ArrayStorage();
        Resume resume = new Resume("0");
        Resume resume1 = new Resume("1");
        Resume resume2 = new Resume("2");
        Resume resume3 = new Resume("3");
//****************************
        System.out.println();
        System.out.print("SAVE(): ");
        storage.save(resume);
        storage.save(resume1);
        storage.save(resume2);
        storage.save(resume3);
        System.out.println("Добавляю в массив " + storage.size() + " резюме...");
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] oneStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(oneStor));
        System.out.println();
//*****************************
        System.out.print("CLEAR(): ");
        System.out.println("Очистка массива...");
        storage.clear();
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] twoStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(twoStor));
        System.out.println();
//*****************************
        System.out.print("SAVE(): ");
        storage.save(resume);
        storage.save(resume1);
        storage.save(resume2);
        storage.save(resume3);
        System.out.println("Добавляю в массив " + storage.size() + " резюме...");
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] threeStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(threeStor));
        System.out.println();
//*****************************
        System.out.print("GET(): ");
        System.out.println("Получение резюме " + resume2 + "...");
        System.out.println("Получено резюме: " + storage.get("2"));
        System.out.println();
//*****************************
        System.out.print("DELETE(): ");
        System.out.println("Удаление резюме: " + resume2 + "...");
        storage.delete(resume2);
        System.out.println("В массиве: " + storage.size() + " резюме.");
//*****************************
        Resume[] fourStor = storage.getAll();
        System.out.println("GET_ALL[элементы массива]: " + Arrays.toString(fourStor));
        System.out.println();
        //*****************************
        System.out.print("CLEAR(): ");
        System.out.println("Очистка массива...");
        storage.clear();
        System.out.println("В массиве: " + storage.size() + " резюме.");
        Resume[] fifthStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(fifthStor));
        System.out.println();
//*****************************
        System.out.print("GET(): ");
        System.out.println("Получение резюме " + resume2 + "...");
        System.out.println("Получено резюме: " + storage.get("2"));
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(fifthStor));
        System.out.println();
//*****************************
        System.out.print("DELETE(): ");
        System.out.println("Удаление резюме: " + resume2 + "...");
        storage.delete(resume2);
        System.out.println("В массиве: " + storage.size() + " резюме.");
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(fifthStor));
        System.out.println();
//*****************************
        System.out.println(" 1:57 рм а я пишу код...иду спать.." );
    }
}
