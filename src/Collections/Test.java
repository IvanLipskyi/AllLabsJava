package Collections;

import java.sql.SQLOutput;
import java.text.CollationElementIterator;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String[] arr = {"Kiev", "Dnipro", "Lvov", "Odessa"};
//      list1 = new ArrayList(Arrays.asList(arr));
        Collections.addAll(list1, arr);
        System.out.println("Лист 1: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Kiev");
        list2.add("Dnipro");
        list2.add("Lvov");
        list2.add("Odessa");
      System.out.println("Лист 2: " + list2);

        ArrayList<String> list3;
        list3 = new ArrayList(Arrays.asList("Tokyo", "Budapest", "Berlin"));
        System.out.println("Лист 3 :" + list3);

        list2.addAll(2,list3);
        System.out.println("Лист 2 после добавления лист 3: " + list2);

        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println("Лист 2 после сортировки:" + list2);

        ListIterator<String> iter = list2.listIterator();
        ArrayList<String> list4 = new ArrayList<>();
        list4.addAll(list2);
        for (int i = iter.nextIndex()+1; i < list4.size(); i++) {
            list4.remove(i);
        }
        System.out.println("Лист 4 с удаленными элементами: " + list4);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Cat");
        set1.add("Dog");
        set1.add("Rabbit");
        set1.add("Fish");
        set1.addAll(list1);
        System.out.println("Добавили в сет 1 список лист 1: " + set1);
        set1.addAll(list2);
        System.out.println("Добавили в сет 1 список лист 2: " + set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        System.out.println("Сет 2 после добавления списка лист2" + set2);
        set2.addAll(list3);
        System.out.println("Сет 2 после добавления списка лист3 (ничего не меняется): " + set2);

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");
        System.out.println("Первый и последний месяцы: " + map1.get(0) + " и " + map1.get(11));
        map1.replace(5, "ОТПУСК!");
        System.out.println("На шестой месяц у нас: " + map1.get(5));
        HashMap<Integer,String>map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("Первый мап:");
        for(Map.Entry<Integer, String> mp1: map1.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", mp1.getKey(), mp1.getValue());
        }
            System.out.println("Второй мап");
        for(Map.Entry<Integer, String> mp2: map2.entrySet()){
            System.out.printf("Key: %d Value: %s \n", mp2.getKey(), mp2.getValue());
        }
        HashMap<String, Set<String>> map3 = new HashMap<>();
        map3.put("Lipskyi", Collections.singleton("2345, lips.ivan@gmail.com, ivan.lips"));
        System.out.println(map3.get("Lipskyi"));
    }
}

