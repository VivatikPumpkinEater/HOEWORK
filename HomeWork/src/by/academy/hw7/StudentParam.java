package hw7V7;

public class StudentParam {

    public String getName() {
        String name;
        name = setName();
        return name;
    }

    public String getName2() {
        String name;
        name = setName();
        return name;
    }


    private static String setName() {
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        int num;
        char symb;
        String name = "";
        for (int i = 0; i < 6; i++) {
            num = (int) (Math.random() * 52);
            symb = alphabet.charAt(num);
            name += symb;
        }
        return name;
    }
}
