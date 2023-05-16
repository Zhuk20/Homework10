import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task2() {
        System.out.println("Задание 3");
        String fullName =  "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','е');
        System.out.println(fullName);
    }

    private static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println("Задание 2");
        String upFullName = fullName.toUpperCase();
        System.out.println(upFullName);
    }
}