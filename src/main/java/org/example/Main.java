package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 8, 5, 6, 7, 8, 4));
    private static List<String> words = new ArrayList<>(List.of("Андрей", "Семен", "Федор", "Семен", "Николай",
            "Андрей", "Петр", "Иван", "Федор"));

    static void task1() {
        System.out.println("Задача №1");
        for (Integer e : nums) {
            if (e % 2 == 0) {
                System.out.print(e + " , ");
            }
        }
        System.out.println();
    }

    static void task2() {
        System.out.println("Задача №2");
        List<Integer> comparativeList = new ArrayList<>(nums);
        Collections.sort(comparativeList);
        int comparativeElement = Integer.MIN_VALUE;
        for (Integer e : comparativeList) {
            if (e % 2 == 0 && e != comparativeElement) {
                System.out.print(e + " , ");
                comparativeElement = e;
            }
        }
        System.out.println();

        Set<Integer> uniqueNumbers = new TreeSet<>(nums);
        for (Integer e : uniqueNumbers) {
            if (e % 2 == 0) {
                System.out.print(e + " , ");
            }
        }
        System.out.println();
    }

    static void task3() {
        System.out.println("Задача №3");
        Set<String> nameWord = new HashSet<>(words);
        System.out.println(nameWord);
        for (String e : nameWord) {
            System.out.print(e + " , ");
        }
        System.out.println();
    }

    static void task4() {
        System.out.println("Задача №4");
        Set<String> nameWord = new HashSet<>(words);
        System.out.println("количество дубликатов = " + (words.size() - nameWord.size()));
    }
}
