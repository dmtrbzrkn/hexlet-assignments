package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        //Инициализируем строковый массив, разделив строку посимвольно.
        String[] letters = symbols.split("");
        //Инициализируем коллекцию ArrayList, в которую добавляем элементы массива letters.
        List<String> lettersList = new ArrayList<>(Arrays.asList(letters));

        for (int i = 0; i < word.length(); i++) {
            //Получаем строку(i-ая букву) в виде подстроки word.
            String letter = word.substring(i, i + 1).toLowerCase();
            //Если коллекция не содержит letter, возвращаем false.
            if (!lettersList.contains(letter)) {
                return false;
            }
            //Если содержит, удаляем элемент из списка.
            lettersList.remove(letter);
        }
        return true;
    }
}
//END
