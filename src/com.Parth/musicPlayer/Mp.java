package com.Parth.musicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Mp {
    public static void main(String[] args) {
        String filePath = "src\\Seedhe Maut - Hausla.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";

            while(!response.equals("Q")) {
                System.out.println("p = play");
                System.out.println("s = stop");
                System.out.println("r = reset");
                System.out.println("q = quit");
                System.out.print("Enter your choice ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("invalid choice");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("could not find the file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("unsupported file");
        } catch (IOException e) {
            System.out.println("file not found");
        } catch (LineUnavailableException e) {
            System.out.println("unable to access the file");
        } finally {
            System.out.println("Bye");
        }
    }
}
