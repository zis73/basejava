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
        //TODO check if resume  present
        
    }

    void save(Resume resume) {//Сохранение резюме
        //TODO check if resume not present
        if (size < storage.length) {
            storage[size] = resume;
            size++;
        }
    }

    Resume get(String uuid) {//Получение резюме
        for (int i = 0; i < size; i++) {

            if (storage[i].uuid == uuid) {

                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {//Удаление
        //TODO check if resume present
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid) {
                storage[i] = storage[size - 1];
            }
        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }

    void zamena(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
            }
        }
    }
}