package com.basejava.webapp.storage;

import com.basejava.webapp.model.Resume;

import java.util.Arrays;

public abstract class AbstractArrayStorage implements Storage {
    private static final int STORAGE_LIMIT = 10000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    public void update(Resume r) {
        int index = getIndex(r.getUuid());
        if(index < 0) {
            System.out.println("Resume " + r.getUuid() + " not exist.");
        } else {
            storage[index] = r;
            System.out.println("Resume " + r.getUuid() + " is update.");
        }
    }

    @Override
    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    @Override
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if(index >= 0) {
            System.out.println("Resume " + r.getUuid() + " already exist.");
        } else if(size == STORAGE_LIMIT) {
            System.out.println("Storage overflow.");
        } else {
            insertElement(r, index);
            size++;
            System.out.println("Resume " + r.getUuid() + " was added.");
        }
    }

    @Override
    public void delete(String uuid) {
        int index = getIndex(uuid);
        if(index < 0) {
            System.out.println("Resume " + uuid + " not exist.");
        } else {
            fillDeletedElement(index);
            storage[size - 1] = null;
            size--;
            System.out.println("Resume " + uuid + " was deleted.");
        }
    }

    @Override
    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if(index < 0) {
            System.out.println("Resume " + uuid + " not exist.");
            return null;
        }
        System.out.println("Resume " + uuid + " was gotten.");
        return storage[index];
    }

    protected abstract void fillDeletedElement(int index);

    protected abstract void insertElement(Resume r, int index);

    protected abstract int getIndex(String uuid);
}
