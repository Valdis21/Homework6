public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        // Задача 3
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        // Задача 4
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        // Задача 5
        int leapYear = 1904;
        for (; leapYear <= 2096; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным");
        }

        // Задача 6
        for (int d = 7; d <= 98; d = d + 7) {
            System.out.println(d);
        }

        // Задача 7
        for (int e = 1; e <= 512; e = e * 2) {
            System.out.println(e);
        }

        // Задача 8 и 9
        int saving = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + saving;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 10
        int number = 2;
        for (int f = 1; f <= 10; f++) {
            System.out.println(number + " * " + f + " = " + number * f);
        }

    }
}