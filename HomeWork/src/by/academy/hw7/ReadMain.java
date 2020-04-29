package hw7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadMain {
    String line;
    List<Students> mass = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ReadMain test = new ReadMain();
        test.reader();
        for (Students newStudents : test.mass)
            System.out.println(newStudents.key);
    }

    public void reader() {
        BufferedReader readFromFile = null;
        try {
            readFromFile = new BufferedReader(new FileReader("text7.txt"));
            while ((line = readFromFile.readLine()) != null) {
                Students newStudents = new Students();
                newStudents.key = line;
                mass.add(newStudents);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (readFromFile != null)
                try {
                    readFromFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public static class Students {
        public String key;
    }
}