package HomeWorkApp11.Array;
/*
1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.

2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
делать взаимодействие с пользователем через консоль и т.д.).
Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get().
Важно: в выбранной Вами коллекции не должно быть повторений имён
 */

import HomeWorkApp11.Array.ArrOpt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_2 = "javahw11v2.txt";
    private static final String FILE_1 = "javahw11v1.txt";

    public static void main(String[] args) {
        // first homework item
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrOpt.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrOpt.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrOpt.fillTheArrayFromFile(wordArray, FILE_2);
        } catch (IOException e) {
            System.out.println("Ошибка заполнения из файла\n");
        }
        try {
            wordArray = ArrOpt.fillTheArrayFromFile(wordArray, FILE_1);
        } catch (IOException e) {
            System.out.println("Ошибка заполнения из файла\n");
        }
        System.out.println(wordArray + "\n");

        ArrOpt.printUniqueWords(wordArray);
    }
}
