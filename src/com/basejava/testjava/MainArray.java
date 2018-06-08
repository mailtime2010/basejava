package com.basejava.testjava;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
        ArrayStorage storage = new ArrayStorage();
        Resume resume = new Resume("1");
        Resume resume1 = new Resume("2");
        Resume resume2 = new Resume("3");
//****************************
        System.out.println();
        System.out.print("SAVE(): ");
        storage.save(resume);
        storage.save(resume1);
        storage.save(resume2);
        System.out.println("Добавляю в массив " + storage.size() + " резюме...");
        System.out.println("Резюме чудом оказались в массиве.");
        System.out.println("Размер массива: " + storage.sizeFull() + ". В массиве: " + storage.size() + " резюме.");
        Resume[] oneStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(oneStor));
        System.out.println();
//*****************************
        System.out.print("CLEAR(): ");
        System.out.println("Очистка массива...");
        storage.clear();
        System.out.println("Проверено! Мин нет! ");
        System.out.println("Размер массива: " + storage.sizeFull() + ". В массиве: " + storage.size() + " резюме.");
        Resume[] twoStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(twoStor));
        System.out.println();
//*****************************
        System.out.print("SAVE(): ");
        storage.save(resume);
        storage.save(resume1);
        storage.save(resume2);
        System.out.println("Добавляю в массив " + storage.size() + " резюме...");
        System.out.println("Резюме, Максим, добавлены в массив.");
        System.out.println("Размер массива: " + storage.sizeFull() + ". В массиве: " + storage.size() + " резюме.");
        Resume[] threeStor = storage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(threeStor));
        System.out.println();
//*****************************
        System.out.print("GET(): ");
        System.out.println("Получение резюме " + storage.get("2") + "...");
        System.out.println("Вы, Максим, получили резюме: " + storage.get("2") + ", пожалуйста, разпишитесь.");
        System.out.println();
//*****************************
        System.out.print("DELETE(): ");
        System.out.println("Удаление резюме: " + resume1 + "...");
        storage.delete(resume1);
        System.out.println("Резюме " + resume1 + ", к сожалению, удалено из массива.");
        System.out.println("Размер массива: " + storage.sizeFull() + ". В массиве: " + storage.size() + " резюме.");
//*****************************
        Resume[] fourStor = storage.getAll();
        System.out.println("GET_ALL[элементы массива]: " + Arrays.toString(fourStor));
        System.out.println();
//THE END
    }
}
