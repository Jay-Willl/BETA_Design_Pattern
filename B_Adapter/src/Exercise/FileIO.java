package Exercise;

import java.io.IOException;

public interface FileIO {
    public abstract void readFromFile(String filename) throws IOException;
    public abstract void writeToFiles(String filename) throws IOException;
    public abstract void setValue(String key, String value);
    public abstract String getValue(String key);
}
