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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1. Получить список из кэша");
        int choise = scanner.nextInt();
        if (choise == 1) {
            fileRepository.getArray();
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("integerCash2.txt"));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        try {
            if (bufferedReader.readLine() == null) {
                System.out.println("список пуст");

            } else {
                bufferedReader = null;
                try {
                    bufferedReader = new BufferedReader(new FileReader("integerCash2.txt"));
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                String line = null;
                while (true) {
                    try {
                        if (!((line = bufferedReader.readLine()) != null)) break;
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                    System.out.println(line);


                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }



        }
    }


