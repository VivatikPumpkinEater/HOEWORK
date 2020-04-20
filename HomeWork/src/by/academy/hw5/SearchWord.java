package hw5;

import java.util.HashMap;
import java.util.Map;

public class SearchWord implements ISearchEngine {
    String sWorld;

    @Override
    public String search(String sWord, String[] text) {
        this.sWorld = sWord;
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word : text) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            if (word.equals(String.format("%s", sWorld))) {
                System.out.println(word + " " + wordToCount.get(word));
            }
        }
        return " ";
    }
}
