package ru.rybak_vadim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class FileRepository {
    public void saveArray(int[] generator1) {
        FileWriter fileWriter = null;
        String string = Arrays.toString(generator1) + "\n" + "\n";
        File file = new File("integerCash2.txt");

        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(string);

        } catch (
                Throwable e) {
            e.printStackTrace();

        } finally {
            try {
                fileWriter.close();

            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Integer> getArray() {
        BufferedReader bufferedReader = null;
        ArrayList<Integer> arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader("integerCash2.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                char[] charArrray = line.toCharArray();

                for (char c : charArrray) {
                    if (Character.isDigit(c)) {


                        int number = Character.getNumericValue(c);
                        arrayList.add(number);

                    }

                }
            }


        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}