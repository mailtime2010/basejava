package com.basejava.webapp;

import com.basejava.webapp.model.Resume;
import com.basejava.webapp.storage.ArrayStorage;

import java.util.Arrays;

public class MainTestArrayStorage {
     private ArrayStorage storage = new ArrayStorage();

    private static void aroundSave(Resume oneResume) {
        System.out.print("SAVE(): ");
        System.out.println("Добавление резюме " + oneResume + "...");
    }

    private static void aroundUpdate(Resume oneResume) {
        System.out.print("UPDATE(): ");
        System.out.println("Обновление резюме " + oneResume + "...");
    }

    private static void aroundGet(Resume oneResume) {
        System.out.print("GET(): ");
        System.out.println("Получение резюме " + oneResume + "...");
    }

    private static void aroundDelete(Resume oneResume) {
        System.out.print("DELETE(): ");
        System.out.println("Удаление резюме: " + oneResume + "...");
    }

    private static void aroundClear() {
        System.out.print("CLEAR(): ");
        System.out.println("Очистка массива...");
    }

    private static void resumeGetAll(ArrayStorage oneStorage) {
        Resume[] Store = oneStorage.getAll();
        System.out.println("GET_All[элементы массива]: " + Arrays.toString(Store));
        System.out.println();
    }

    private void setSave(Resume oneResume) {
        aroundSave(oneResume);
        storage.save(oneResume);
        resumeGetAll(storage);
    }

    private void setUpdate(Resume oneResume) {
        aroundUpdate(oneResume);
        storage.update(oneResume);
        resumeGetAll(storage);
    }

    private void setGet(Resume oneResume) {
        aroundGet(oneResume);
        oneResume = storage.get(oneResume.getUuid());
        System.out.println();
    }

    private void setDelete(Resume oneResume) {
        aroundDelete(oneResume);
        storage.delete(oneResume.getUuid());
        resumeGetAll(storage);
    }

    private void setClear(Resume oneResume) {
        aroundClear();
        storage.clear();
        System.out.println("В массиве: " + storage.size() + " резюме.");
        resumeGetAll(storage);
    }

    public void ResumeAll() {

        Resume resume = new Resume();
        resume.setUuid("0");
        Resume resume1 = new Resume();
        resume1.setUuid("1");
        Resume resume2 = new Resume();
        resume2.setUuid("2");
        Resume resume3 = new Resume();
        resume3.setUuid("3");
        Resume resume4 = new Resume();
        resume4.setUuid("4");

//****************************
        System.out.println();
        setSave(resume1);
//****************************
        setSave(resume2);
//*****************************
        setSave(resume2);
//*****************************
        setSave(resume3);
//*****************************
        setGet(resume4);
//*****************************
        setGet(resume2);
//*****************************
        setUpdate(resume);
//*****************************
        setUpdate(resume2);
//*****************************
        setDelete(resume1);
//*****************************
        setDelete(resume4);
//*****************************
        setClear(null);
//******************************/

    }
}
