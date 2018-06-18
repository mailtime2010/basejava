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
            System.out.println("NO UPDATE: "+ r.getUuid());
           // throw new NotExistStorageException(r.getUuid());
        } else {
            storage[index] = r;
            System.out.println("updated:  " + r.getUuid());
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
            System.out.println("NO SAVE: " + r.getUuid());
          //  throw new ExistStorageException(r.getUuid());
        } else if(size == STORAGE_LIMIT) {
            System.out.println("NO SAVE-OVERFLOW: " + r.getUuid());
            //throw new StorageException("Storage overflow.", r.getUuid());
        } else {
            insertElement(r, index);
            size++;
            System.out.println("Added : " + r.getUuid());
        }
    }

    @Override
    public void delete(String uuid) {
        int index = getIndex(uuid);
        if(index < 0) {
            System.out.println("NO DELETE: " + uuid);
            //throw new NotExistStorageException(uuid);
        } else {
            fillDeletedElement(index);
            storage[size - 1] = null;
            size--;
            System.out.println("deleted:  " + uuid);
        }
    }

    @Override
    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if(index < 0) {
          //  throw new NotExistStorageException(uuid);
         //   System.out.println("NO GET: "+uuid);
            return null;
        }
      //  System.out.println("got: " + uuid);
        return storage[index];
    }

    protected abstract void fillDeletedElement(int index);

    protected abstract void insertElement(Resume r, int index);

    protected abstract int getIndex(String uuid);
}
