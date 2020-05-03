package hw7V7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReadMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("stList.bin"));

        List<StudentGenerate> student = new ArrayList<StudentGenerate>();

        student = Arrays.asList((StudentGenerate[]) in.readObject());

        student.sort(new Comparator<StudentGenerate>() {
            @Override
            public int compare(StudentGenerate o1, StudentGenerate o2) {
                if (o1.getName().charAt(0) == o2.getName().charAt(0)) return 0;
                else if (o1.getName().charAt(0) > o2.getName().charAt(0)) return 1;
                else return -1;
            }
        });
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stSort.bin")); //переодически символы
        for (int i = 0; i < student.size(); i++) {
            out.writeUTF(student.get(i).toString() + "\n");
        }
        out.close();
    }
}
