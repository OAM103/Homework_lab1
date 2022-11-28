package com.metanit;

import java.util.Scanner;

public class Main {
    public static void Exer1(){
        double SUM = 0;
        int[] mas = new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i<10; i++){
            SUM+=mas[i];
        }
        System.out.println("SUM: " + SUM);
        System.out.println("SR_ARFM: " + SUM/10);
    }

    public static void Exer2(){
        int[] mas = new int[10];
        Scanner sc = new Scanner(System.in);
        mas[0] = sc.nextInt();
        int SUM = mas[0];
        int MIN = mas[0];
        int MAX = 0;
        int i = 1;
        while (i < 10){
            if(sc.hasNextInt()) mas[i] = sc.nextInt();
            else System.out.println("Вы ввели неверные данные!");
            SUM+=mas[i];
            if(mas[i]>MAX)MAX = mas[i];
            if(mas[i]<MIN)MIN = mas[i];
            i++;
        }
        System.out.println("SUM: "+SUM);
        System.out.println("MIN: "+MIN);
        System.out.println("MAX: "+MAX);
    }

    public static void Exer4(){
        for(double i = 1; i<=10; i++){
            double A = 1/i;
            System.out.printf("%.6f%n", A);
        }
    }

    public static void Exer5(int a){
        int otv = 1;
        for(int i = 1; i<=a; i++){
            otv *= i;
        }
        System.out.println(otv);
    }


    public static void main(String[] args) {
        Exer4();
        for (String str : args){ //Exser 3
            System.out.println(str);
        }
    }
}
