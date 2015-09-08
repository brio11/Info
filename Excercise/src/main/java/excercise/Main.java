package excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\Reozytoria\\sample-files\\small.in");
        Text text = getTextFromFile(file);
        saveToCSV(text, "D:\\Reozytoria\\Info\\Excercise\\text.csv");
    }

    private static Text getTextFromFile(File file) {
        Text text = new Text();

        try {
            Scanner read = new Scanner(file, "UTF-8");

            Sentence sentence = new Sentence();

            while (read.hasNext()) {
                String word = read.next();
                sentence.add(word);

                if (word.endsWith(".") && !word.equals("Mr.")) {
                    sentence.sort();
                    //System.out.println(sentence.getWords());
                    text.add(sentence);
                    sentence = new Sentence();
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        return text;
    }

    private static void saveToCSV(Text text, String filePath) {
        String csv = "";
        for (int i = 0; i < text.getSentences().size(); i++) {
            Sentence sen = text.getSentences().get(i);
            int number = i + 1;
            String words = "";
            
            for (String word : sen.getWords()) {
                words = words + word + ",";
                
            }
            
            String sentenceLine = "Sentence " + number + "," + words;
            csv = csv + sentenceLine + "\n";
        }
        System.out.println(csv);
        try {
            PrintWriter writer = new PrintWriter(filePath, "UTF-8");
            writer.write(csv);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
