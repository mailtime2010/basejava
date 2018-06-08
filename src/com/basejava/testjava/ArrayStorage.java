package com.basejava.testjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayStorage {

    Resume[] storage = new Resume[10];

    public void save(Resume resume) {

        for(int i = 0; i <= 9999; i++) {
            if(storage[i] == null) {
                storage[i] = resume;
                break;
            }
        }
    }

    public Resume get(String name) {
        Resume two = null;
        for(Resume one : storage) {
            if(one !=null && one.name.equals(name)){ two=one; }
        } return two;
    }

    public void delete(Resume resume) {
        ArrayList<Resume> list = new ArrayList<>();
        for(Resume one : storage) {
            if(one != null) { list.add(one);}
        }
        Iterator<Resume> iterator = list.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().equals(resume)) {
                iterator.remove();
            }
        }
        list.toArray(storage);
    }

    public int size() {
        ArrayList<Resume> list = new ArrayList<>();
        for(Resume one : storage) {
            if(one != null) {list.add(one);}
        }
        int size = list.size();
        return size;
    }

    public int sizeFull() {
        return storage.length;
    }

    public void clear() {
        Arrays.fill(storage, null);
    }

    Resume[] getAll() {
        ArrayList<Resume> list = new ArrayList<>();
        for(Resume one : storage) {
            if(one != null) {list.add(one);}
        }
        Resume[] resArr = new Resume[list.size()];
        list.toArray(resArr);
        return resArr;

    }


}
