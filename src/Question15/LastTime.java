package Question15;

import java.io.File;
import java.util.Date;

public class LastTime {
    public static void main(String[] args) {
        File file = new File("/home/knoldus/Assignments/Java_Advance_Assignment/test.txt");
        Date date=new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }
}