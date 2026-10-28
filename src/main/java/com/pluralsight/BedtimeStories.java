package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) throws IOException {
    Scanner read = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = read.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;
            int lineNumber = 1;

            while ((input = bufReader.readLine()) != null) {

                System.out.println(lineNumber + ". "+ input);
                lineNumber+= 1;

            }

            bufReader.close();

        } catch (IOException e) {
            System.out.println("Invalid file name.");
        }


    }
}
