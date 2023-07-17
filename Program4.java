package screeningtest;

import java.util.*;
import java.util.Map.Entry;

public class Program4 {
public static void main(String[] args) {
	 int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
     Map<Integer, Integer> hMap = new HashMap<>();

     for (int i = 1; i <= 9; i++) {
         hMap.put(i, 0);
     }

     for (int number : input) {
         for (int i = 1; i <= 9; i++) {
             if (number % i == 0) {
                 hMap.put(i, hMap.get(i) + 1);
             }
         }
     }

     String s=hMap.toString().replaceAll("=", ":");
     System.out.println(s);
}
}