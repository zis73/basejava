package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public class SortedArrayStorage extends AbstractArrayStorage {

    @Override
    protected void doSave(Resume r, int index) {
        int indexSave = -index - 1;
        System.arraycopy(storage, indexSave, storage, indexSave + 1, size - indexSave);
        storage[indexSave] = r;
    }

    @Override
    protected void doDelete(int index) {
        int indexReplace = size - index - 1;
        if (indexReplace > 0) {
            System.arraycopy(storage, index + 1, storage, index, indexReplace);

        }
    }

    @Override
    protected int getIndex(String uuid) {
        Resume searchKey = new Resume(uuid);
        return Arrays.binarySearch(storage, 0, size, searchKey);
    }
}

