package excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\Reozytoria\\sample-files\\small.in");
       
        try {
            Scanner read = new Scanner(file, "UTF-8");
            
        while (read.hasNext()) {
            String word = read.next();
            
            System.out.print(word + " ");
            
            
            if (word.endsWith(".")){
             System.out.println();                
            } else {
                    
            }
            
            
        }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
