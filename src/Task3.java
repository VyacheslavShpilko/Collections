import java.util.*;

public class Task3 {
    //3. Создайте приложение, которое принимает от пользователя два набора чисел через консоль
    // и выводит на экран пересечение этих наборов (то есть только те числа, которые есть в обоих наборах).
    // Для этого используйте коллекцию Set.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s1 = scanner.nextLine().split(" ");
        String[] s2 = scanner.nextLine().split(" ");

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        Set<String> set = new HashSet<>();

        Collections.addAll(set1, s1);
        Collections.addAll(set2, s2);
        set.addAll(set1);
        set.addAll(set2);

        for(String letter : set){
            if(set1.contains(letter)
                    && set2.contains(letter))
                    {
                System.out.print(letter + " ");
            }
        }
    }
}
