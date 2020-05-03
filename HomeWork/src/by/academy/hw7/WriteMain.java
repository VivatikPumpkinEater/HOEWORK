package hw7V7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMain {

    public static void main(String[] args) throws IOException {
        StudentParam rnd = new StudentParam();

        StudentGenerate[] student = new StudentGenerate[100000];

        for (int i = 0; i < student.length; i++) {
            student[i] = new StudentGenerate(rnd.getName(), rnd.getName2());
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stList.bin"));
        out.writeObject(student);
        out.close();
    }

}
