package Question5;

import java.io.BufferedReader;
import java.io.FileReader;
import Printer.*;

class WordCountInFile {
    public static void main(String[] args) throws Exception {
        String line ;
        int wordCount =0;
        int lineCount =0;
        int characterCount=0;
        FileReader file =new FileReader("/home/knoldus/Assignments/Java_Advance_Assignment/lear.txt");
        BufferedReader br=new BufferedReader(file);
        while ((line = br.readLine()) != null){
            lineCount++;
            String words[] = line.split(" ");
            characterCount += line.length();
            wordCount += words.length;
        }
        Printer.print("Lines: "+lineCount+"\nWords: "+wordCount+ "\nCharacters: "+characterCount);
    }
}