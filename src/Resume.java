/**
 * com.urise.webapp.model.Resume class
 */
public class Resume {

    // Unique identifier
    String uuid;

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {

        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }
}

