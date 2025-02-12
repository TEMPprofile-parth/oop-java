package com.Parth.RandW;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args) {

        // whenever you are using fileWriter you have to use try catch block
        // if you write anything in a file using FileWriter then it will erase everything and write the content you have provided

        String filePath = "C:\\Users\\parth\\Desktop\\test.txt";
//        String fileContent = "I like Pizza, But I prefer to eat Punjabi";
        String fileContent = """
                I smile when I am angry,
                I cheat and I lie,
                I do what I have to do to get by.
                """;
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(fileContent);
            System.out.println("file has been written");
        }catch (FileNotFoundException e){
            System.out.println("could not found the file");
        }
        catch (IOException e) {
            System.out.println("could not write file");
        }
    }
}