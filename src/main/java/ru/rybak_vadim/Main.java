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

        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println(list);
        }


    }
}


