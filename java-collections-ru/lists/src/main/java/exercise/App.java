package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols,String word ) {
        List<Character> wordList = new ArrayList<>();
        List<Character> symbolsList = new ArrayList<>();
        int contentLetter = 0;
        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.toLowerCase().charAt(i));
        }
        for (int i = 0; i < symbols.length(); i++) {
            symbolsList.add(symbols.toLowerCase().charAt(i));
        }
        for (Character letter : wordList) {
            if (!symbolsList.contains(letter)) {
                break;
            } else {
                symbolsList.remove(letter);
                contentLetter++;
            }
        }
        return contentLetter == wordList.size();
    }
}
//END
