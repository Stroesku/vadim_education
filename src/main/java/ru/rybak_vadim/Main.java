package ru.rybak_vadim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerGenerator integerGenerator = new IntegerGenerator();
        FileRepository fileRepository = new FileRepository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1. Получить список из кэша");
        System.out.println("2. Добавить новый список");
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
        if (choise == 2) {
            System.out.println("введите количество чисел ");
            int numberOfElements = scanner.nextInt();

            System.out.println("введите минимальное число");
            int min = scanner.nextInt();

            System.out.println("введите максимальное число");
            int max = scanner.nextInt();
            System.out.println("хотите сохранить список ?");
            System.out.println("1. да");
            System.out.println("2. нет");
            int choise2 = scanner.nextInt();
            if(choise2 == 1){

            }

            int[] generator1 = integerGenerator.generateNumbers(numberOfElements, min, max);
            fileRepository.saveArray(generator1);
            ArrayList<Integer> listOfNumbers = fileRepository.getArray();
            System.out.println(listOfNumbers);
//            for (int i = 0; i < generator1.length; i++) {
//                System.out.println(listOfNumbers.get(i));

        }
    }


}