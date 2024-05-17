package ru.rybak_vadim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerGenerator integerGenerator = new IntegerGenerator();
        FileRepository fileRepository = new FileRepository();
        ArrayList<Integer> list = fileRepository.getArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Показать существующие списки ");
        System.out.println("2)добавить новый список ");
        int choise = scanner.nextInt();

        if (choise == 1) {
            checkingScenario(list);
        }
        if (choise == 2){
            System.out.println("введите количество чисел ");
            int numberOfElements = scanner.nextInt();
            System.out.println("введите минимальное число");
            int min = scanner.nextInt();
            System.out.println("введите максимальное число");
            int max = scanner.nextInt();

            int[] newList = integerGenerator.generateNumbers(numberOfElements, min, max);
            fileRepository.saveArray(newList);

            System.out.println("Список успешно сохранен " + Arrays.toString(newList));
        }
    }

        public static void checkingScenario(ArrayList<Integer> list) {
            if (list.isEmpty()) {
                System.out.println("Список пуст");
            } else {
                System.out.println(list);
            }
        }
    }



