import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Task2 {
    //2. Напишите программу, которая принимает от пользователя строку текста и выводит на экран количество вхождений каждого символа в этой строке.
    // Результат должен быть выведен на экран в виде пар "символ - количество вхождений". Используйте для этого коллекцию Map.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.replaceAll(" ", "");
        char [] strChar = str2.toCharArray();
        Map <Character, Integer> strMap = new HashMap<>();
        for (char symbol : strChar) {
            if (strMap.containsKey(symbol)) {
                strMap.replace(symbol,strMap.get(symbol) + 1);
            }
            else {
                strMap.put(symbol,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
            System.out.printf("Символ %s встречается %s раз \n", entry.getKey(), entry.getValue());
        }
  }
}
