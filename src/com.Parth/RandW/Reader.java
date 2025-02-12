package com.Parth.RandW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\parth\\Desktop\\Something.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
//            System.out.println("here");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("Io Exception");
//            throw new RuntimeException(e);
        }
    }
}
