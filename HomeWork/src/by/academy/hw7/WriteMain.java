package hw7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMain {

    public static void main(String[] args) throws IOException {
        int counter = 10;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("text7.txt"));

        Object student;
        for (int i = 0; i < counter; i++) {
//            student = String.format("\n Name %s, SecondName %s;\n", setName(), setName());
            student = setName() + " " + setName();
            out.writeObject(student);
            out.flush();
        }
        out.close();

    }

    private static String setName() {
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        int num;
        char symb;
        String name = new String();
        for (int i = 0; i < 6; i++) {
            num = (int) (Math.random() * 52);
            symb = alphabet.charAt(num);
            name += symb;
        }
        return name;
    }
}