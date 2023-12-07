package ru.gb.seminar;

import java.util.*;

public class Main {
    //region Задачи:
    /*
    1. Создать колекцию имен с помощью интерфейса List
    2. Отсортировать коллекцию в обратном алфовитном порядке
    3. Отсортировать коллекцию по количеству букв в слове
    4. Развернуть коллекцию
     */
    public static void main(String[] args) {
        List<String> nameList = genderList();
        System.out.println("Не сортированный массив " + nameList);

        sort(nameList); //Метод сортировки о обратном порядке
        System.out.println("Массив отсортирован по алфавиту в обратном порядке " + nameList);

        sortByLenght(nameList); //Метод сортировки по количеству букв в слове
        System.out.println("Массив отсортирован по количеству букв в слове " + nameList);

        Collections.reverse(nameList); //Развернуть коллекцию
        System.out.println(nameList);
    }

    public static List<String> genderList(){
        List<String> name = new ArrayList<>();
        name.add("Константин");
        name.add("Денис");
        name.add("Роман");
        name.add("Дмитрий");
        name.add("Александр");
        name.add("Ренат");
        name.add("Руслан");
        name.add("Артём");

        return name;
    }

    /**
     * Метод сортировки по количеству букв в слове
     * @param list
     */
    private static void sort(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
    }

    /**
     * Метод сортировки о обратном порядке
     * @param list
     */
    private static void sortByLenght(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }
}
