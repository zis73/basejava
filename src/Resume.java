/**
 * com.urise.webapp.model.Resume class
 */
public class Resume {

    // Unique identifier
    String uuid;

    @Override
    public String toString() {
        return uuid;
    }

    public String getResume() {
        return this.uuid;
    }
    public void setResume(){
        this.uuid = uuid;
    }
}
