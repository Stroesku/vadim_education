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
        ArrayList<Integer> list = fileRepository.getArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите цифру 1 ");
        int choise = scanner.nextInt();

        if (choise == 1) {
            checkingScenario(list);
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



