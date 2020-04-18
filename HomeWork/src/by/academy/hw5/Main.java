package hw5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    private static char[] chars = ";-:)(!?./,'\"".toCharArray();

    public static void main(String[] args) throws Exception {
        String data = readFileAsString("C:\\Users\\Ваня\\Desktop\\Война и мир.txt");
        data = replaceAllChars(data, chars);
        String[] words = data.toLowerCase().split("\\s+");

        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            if(word.equals("война") | word.equals("и") | word.equals("мир")){
                System.out.println(word + " " + wordToCount.get(word));
            }

        }
//        hw5.ValueComparator sort = new hw5.ValueComparator(wordToCount); //сортировка всех слов из текста
//        TreeMap<String, Integer> sorted = new TreeMap<>(sort);
//        sorted.putAll(wordToCount);
//        System.out.println("SORT: \n" + sorted);
    }

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static String replaceAllChars(String str, char[] chars){
        for (char aChar: chars) {
            while (str.indexOf(aChar) > -1){
                str = str.replace(String.valueOf(aChar), " ");
            }
        }
        return str;
    }
}
