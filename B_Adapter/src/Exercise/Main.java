package Exercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile("/Users/blank/repo/BETA_Design_Pattern/B_Adapter/src/Exercise/file.txt");
            f.setValue("year", "2022");
            f.setValue("month", "Nov");
            f.setValue("day", "4");
            f.writeToFiles("/Users/blank/repo/BETA_Design_Pattern/B_Adapter/src/Exercise/file.txt");
        }catch (IOException e) {
            throw new RuntimeException(e);
        };
    }
}
