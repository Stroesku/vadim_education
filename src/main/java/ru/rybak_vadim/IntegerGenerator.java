package ru.rybak_vadim;

import java.util.Random;

public class IntegerGenerator {
    Random random = new Random();

    public int generate(int min, int max) {
        int randomNumber = random.nextInt(max - min) + min;
        return randomNumber;
    }

    public int[] generateNumbers(int numberOfElements, int min, int max) {
        int[] generatedNumbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            generatedNumbers[i] = generate(min, max);
        }
        return generatedNumbers;
    }

    public int[] sort(int[] newList) {
        boolean sorted = false; //создание переменной sorted и присваивание ей значения false.
//        создаем цикл while, который выполняется пока sorted не стане равной true
        while (!sorted) {
//            присваивание переменной sorted значения true. если массив уже отсортирован то цикл закончится
            sorted = true;
//            перебираем элементы массива
            for (int s = 1; s < newList.length; s++) {
                // if проверяет если первое значение текущей позиции меньше предыдущей
                if (newList[s] < newList[s - 1]) {
//                   создание временной переменной для текущего значения массива
                    int temp = newList[s];
                    // замена текущего значения на предыдущее
                    newList[s] = newList[s - 1];
//                    замена предыдущего значения с сохраненым временым значением
                    newList[s - 1] = temp;
                    sorted = false;
                }
            }
        }
        return newList;
    }
}

