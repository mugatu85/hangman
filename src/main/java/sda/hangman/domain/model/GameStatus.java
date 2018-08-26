package sda.hangman.domain.model;

import java.util.ArrayList;
import java.util.List;

public class GameStatus {

    private String name;
    private String phrase;
    private Character[] phraseState;
    private Integer successAttampts;
    private Integer failedAttempts;
    private List<Character> history;

    public GameStatus(String name, String phrase) {
        this.name = name;
        this.phrase = phrase;

        this.successAttampts = 0;
        this.failedAttempts = 0;
        this.history = new ArrayList<>();
    }

    public static class GameStatusHelper{
        public Character[] preparePhraseState (String phrase){
            char[] chars = phrase.toCharArray();
            Character[] result = new Character[chars.length];
            for (int i = 0; i <chars.length ; i++) {
                if (!Character.isLetter(chars[i])){
                    result[i] = chars[i];
                }
            }
            return result;

        }
    }
}
