import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size = 0;

    void clear() {//Очистка
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void update(Resume resume) {
        int index = getIndex(resume.getUuid());
        if (index == -1) {
            System.out.println("Error");
        } else {
            storage[index] = resume;
        }
    }

    void save(Resume resume) {
        if (getIndex(resume.getUuid()) != -1) {
            System.out.println("Ошибка");
        } else if (size >= storage.length) {
            System.out.println("Места больше нет");
        } else {
            storage[size] = resume;
            size++;
        }
    }

    Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            System.out.println("Error");
            return null;
        } else {
            return storage[index];
        }
    }

    void delete(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            System.out.println("Error");
        } else {
            storage[index] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }

    }

    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }

    public int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}