package Strings;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        // ЧАСТЬ 1,2

        System.out.println("--------------- ЧАСТЬ 1, 2 ---------------------");
        String str1 = "Pizza";
        String str2 = new String("Beer");
        char ch1[] = {'V', 'a', 'n', 'y', 'a'};
        String str3 = new String(ch1);
        String b1 = "Pasta";
        String str5 = new String(b1.getBytes());
        StringBuilder b2 = new StringBuilder("Java");
        String str6 = new String(b2);
        System.out.println(str1 + " " + str2 + " " + str3 + " " + str5 + " " + str6);

        //ЧАСТЬ 3

        System.out.println("---------------- ЧАСТЬ 3 ---------------------");
        String str7 = "Апельсин,Яблоко,Гранат,Груша";
        String max = " ";
        String shorter = " ";
//        for (String str8: str7.split(",")){
//            System.out.println(str8);
        String[] str9 = str7.split(",");
        for (int i = 0; i < str9.length; i++) {
            System.out.print(str9[i] + "\n");
            for (int j = 0; j < str9.length; j++) {
                if (str9[i].length() >= max.length()) {
                    max = str9[i];
                }
            }
        }
        String low = max.toLowerCase();
        System.out.println("Самое длинное слово: " + low);
        System.out.println("Сокращенные варианты: ");
        for (int i = 0; i < str9.length; i++) {
            System.out.println(str9[i].substring(0, 3));
        }
        String str10 = "  Я_новая_строка   ";
        System.out.println("До обрезки:|" + str10 + "|");
        String trim1 = str10.trim();
        System.out.println("После обрезки:|" + trim1 + "|");
        System.out.println(trim1.replace('_', ' '));

        Scanner scan = new Scanner(System.in);
        String str11 = scan.nextLine();
        System.out.println("Вы ввели " + "\"" + str11 + "\".");
        if(str11.startsWith("Запуск",0)){
            System.out.println("Запускаем процесс");
        }
        if(str11.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        String str12 = str11.toLowerCase();
        if(str12.contains("ошибка")){
            System.out.println("Произошла ошибка");
        }

        //ЧАСТЬ 3

        System.out.println("---------------- ЧАСТЬ 4 ---------------------");
        StringBuilder sb1 = new StringBuilder(str1 + str2 + str3 + "\n" + str5 + str6 + str7 + "\n" + low + str11 + trim1);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
    }
}
