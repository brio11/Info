package excercise;

import java.util.ArrayList;
import java.util.List;

public class Text {
    
    List<Sentence> sentences = new ArrayList();
    
    public void add(Sentence sentence) {
        this.sentences.add(sentence);
    }
    
    public List<Sentence> getSentences() {
        return sentences;
    }
    
    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }
}
