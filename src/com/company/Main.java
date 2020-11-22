package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество минут: ");

        int minut = scanner.nextInt();

        final int hour = 60;
        final int day =24;
        final int year = 365;

        int perhour = minut/hour;
        int perday = perhour/day;
        int peryear = perday/year;
        int remainderday = perday%year;

        System.out.println(minut + " минут - это: " + peryear + " лет " + remainderday  + " и дней.");

        System.out.println("Введите градусы Фаренгейта (°F): ");

        double gradusfar = scanner.nextInt();
        final double ratioFaring =1.8;
        double celsia =  (gradusfar-32)/ratioFaring;
        double celsiaResult = Math.round(celsia * 100.0) / 100.0;

        System.out.println(gradusfar + " градусов Фаренгейта - это  : " + celsiaResult + " °C   Цельсия");

        System.out.println("Введите длину в дюймах: ");

        double inch = scanner.nextInt();
        final double inchPerM =0.0254;
        double metr = inch*inchPerM;

        System.out.println(inch + " дюйма - это : " + metr  + " метра");

        System.out.println("Введите число от 100 до 999 : ");

        int num = scanner.nextInt();
        int num1 = num%10;
        int num2 = (num/10)%10;
        int num3 = num/100;
        int totalNum = num1 + num2 + num3;
        System.out.println( "Сумма цифр введеного числа: " + totalNum);


    }

}

// write your code here

