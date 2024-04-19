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


}