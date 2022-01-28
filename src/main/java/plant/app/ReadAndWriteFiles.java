package plant.app;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class ReadAndWriteFiles {
    public static void readFromFile() throws Exception {
        try {
            InputStream file = ReadAndWriteFiles.class.getResourceAsStream("/files/AllPlants.txt");
            Scanner reader = new Scanner(file);
            String next = reader.nextLine();
            System.out.println(next);
        } catch (Exception e) {
            System.err.println(e);;
        }
    }
}
