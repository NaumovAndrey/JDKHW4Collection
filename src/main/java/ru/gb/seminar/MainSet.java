package ru.gb.seminar;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        List<String> list = genderList();
        Set<String> set = new HashSet<>(list); //уникальный список Set на основании List
//        Set<String> setL = new LinkedHashSet<>(list);
//        Set<String> setT = new TreeSet<>(list);
//        System.out.println(set);
//        System.out.println(setL);
//        System.out.println(setT);

//        System.out.println(getMaxBayLenght(set));
        removeByChar(set);
        System.out.println(set);

    }

    static void removeByChar (Set<String> set){ //удалеет слова содержащие букву
        set.removeIf(s -> s.contains("а"));
    }

    static String getAlphabet(Set<String> set){
        Set<String> set1 = new TreeSet<>(set);
        Iterator<String> iterator = set1.iterator();
        if (iterator.hasNext()) return iterator.next();
        return null;
    }

    static String getMaxBayLenght(Set<String> set){
        return set.stream().max(Comparator.comparingInt(String::length)).get();
    }

    public static List<String> genderList(){
        List<String> name = new ArrayList<>();
        name.add("Константин");
        name.add("Денис");
        name.add("Роман");
        name.add("Роман");
        name.add("Роман");
        name.add("Дмитрий");
        name.add("Дмитрий");
        name.add("Александр");
        name.add("Александр");
        name.add("Ренат");
        name.add("Ренат");
        name.add("Ренат");
        name.add("Руслан");
        name.add("Артём");

        return name;
    }
}
