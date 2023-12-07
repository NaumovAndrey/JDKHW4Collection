package ru.gb.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //region Коллекции
        Collection<Integer> collection = List.of(1, 2, 3, 4, 5);
        //1 способ: Iterator
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " "); //1 2 3 4 5
        }
        System.out.println();

        //2 способ For each
        for (Integer value : collection) {
            System.out.print(value + " "); //1 2 3 4 5
        }
        System.out.println();
            
        //3 способ Stream
        collection.stream().forEach(value -> System.out.print(value + " ")); //1 2 3 4 5
        System.out.println();

        //3.2
        collection.stream().forEach(System.out::print); //12345 или System.out::println - с новой строки
        System.out.println();
        //endregion

        //region List
        ArrayList<Integer> list = new ArrayList<>(collection);
        //endregion

        //region HMap
        Map<String, Integer> map = Map.of("hello", 1, "world", 2);

        //for each
        for (var entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String s: map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }

        //Stream
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        //endregion

        //region Set (Множества)

        //endregion
    }
}
