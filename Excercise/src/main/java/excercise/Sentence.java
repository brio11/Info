package excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sentence {

    private List<String> words = new ArrayList();

    public void add(String word) {
        this.words.add(word);
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void sort() {
        Collections.sort(words);
    }

}
