import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        int[] mas1 = new int[]{5, 4, 3, 8, 15, 23, 20};
        int[] mas2 = new int[]{3, 4, 9, 15, 8};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (mas1[i] == mas2[j]) {
                    set.remove(mas1[i]);
                    break;
                } else {
                    set.add(mas1[i]);
                    //для наглядности
                    System.out.println(set);
                }
            }
        }
        System.out.println(set);
    }
}

