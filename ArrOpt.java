package HomeWorkApp11.Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrOpt {

    public static List<String> fillTheArray(List<String> array) {
        array.add("heavy");
        array.add("heavy");
        array.add("low");
        array.add("low");
        array.add("dance");
        array.add("Gavin");
        array.add("dance");
        array.add("money");
        array.add("Money");
        array.add("Привет");
        array.add("привет");
        array.add("привеТ");
        array.add("прив");
        return array;
    }
    public static List<String> fillTheArrayFromFile(List<String> array, String fileName) throws IOException {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            buffer.append(reader.readLine() + "\n");
        }
        if(buffer.length() > 0) {
            String[] tempArr = buffer.toString().split(" ");
            for (String temp : tempArr) {
                array.add(temp);
            }
        }
        return array;
    }

    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if(tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);
        }
        System.out.println();
    }
}