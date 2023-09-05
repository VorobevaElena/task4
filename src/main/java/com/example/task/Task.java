package com.example.task;


import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        Scanner y = new Scanner(System.in);
        int y1 = y.nextInt();
        Scanner z = new Scanner(System.in);
        int z1 = z.nextInt();
        int sr = (x1+y1+z1)/3;
        System.out.println("Среднее арифметическое - " + sr);
        if (sr/2>3)
        {
            System.out.println("Программа выполнена корректно");
        }

    }

}
