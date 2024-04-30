package ru.rybak_vadim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerGenerator integerGenerator = new IntegerGenerator();
        FileRepository fileRepository = new FileRepository();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("integerCash2.txt"));
            String line = reader.readLine();

            if (line == null) {
                System.out.println("список пуст");
            } else {
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}


