package hw7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadMain {
    String line;
    List<Students> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ReadMain test = new ReadMain();
        test.reader();
        for (Students newStudents : test.list)
            System.out.println(newStudents.wh);
    }

    public void reader() {
        BufferedReader readFromFile = null;
        try {
            readFromFile = new BufferedReader(new FileReader("text7.txt"));
            while ((line = readFromFile.readLine()) != null) {
                Students newStudents = new Students();
                newStudents.wh = line;
                list.add(newStudents);
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
        public String wh;
    }
}