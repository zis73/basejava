package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public interface Storage {

    public void clear();

    public void update(Resume resume);

    public void save(Resume resume);

    public Resume get(String uuid);

    public void delete(String uuid);

    public Resume[] getAll();

    public int size();

}
