package ru.rybak_vadim;

import java.awt.*;
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

        System.out.println(" 1) Показать существующие списки ");
        System.out.println(" 2) добавить новый список ");

        UserKeyboardOption choice = null;
        int input = scanner.nextInt();
        if (input == 1) {
            choice = UserKeyboardOption.EXISTING_LIST;
        } else if (input == 2) {
            choice = UserKeyboardOption.ADD_NEW_LIST;
        }
        else{
            System.out.println("выберите возможный вариант ответа");
        }
        switch (choice) {
            case EXISTING_LIST -> {
                checkingScenario(list);

            }
            case ADD_NEW_LIST -> {
                generateListScenario(integerGenerator, fileRepository, scanner);
            }
        }
    }
    public static void checkingScenario(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println(list);
        }
    }

    public static void generateListScenario(IntegerGenerator integerGenerator, FileRepository fileRepository, Scanner scanner) {
        System.out.println("Введите количество чисел: ");
        int numberOfElements = scanner.nextInt();
        System.out.println("Введите минимальное число: ");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное число: ");
        int max = scanner.nextInt();
        int[] newList = integerGenerator.generateNumbers(numberOfElements, min, max);
        System.out.println("хотите ли отсортировать список перед сохранением " + " 1)да " + " 2)нет");

        if (scanner.nextInt() == 1) {
            integerGenerator.sort1(newList);
            fileRepository.saveArray(newList);
            System.out.println("Список успешно сохранен и отсортирован: " + Arrays.toString(newList));
        }
        else {
            fileRepository.saveArray(newList);
            System.out.println("Список успешно сохранен: " + Arrays.toString(newList));
        }
    }
}

