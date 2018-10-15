package com.company;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        method3 ();
        //  method2();
        // method1();
        // write your code here
    }


    public static void method1(){
        Scanner scan = new Scanner(System.in);

        int n=25;
        int max=0;
        int min;
        int index_max=0;
        int index_min=0;
        // int temp=0;
        int array[]= new int[n];
        System.out.println("Исходный массив с поменяными местами max и min");
        random(array);
        printArray(array,n);
        min=array[0];
        for (int i = 0; i <n; i++) {
            if (max<array[i]) {
                max = array[i];
                index_max = i;
            }
            else if (min>array[i]) {
                min = array[i];
                index_min = i;
            }

        }

        array[index_max]=min;
        array[index_min]=max;
        printArray(array,n);



    }

    public static void method2() {
        int n = 25;
        int temp=0;
        int array[] = new int[n];
        random(array);
        printArray(array, n);
        for (int i=n-1;i>=0;i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
        System.out.println("Массив отсортирован ");
        printArray(array,n);
    }



    public static void method3 (){
        int n = 20;
        int summa=0;
        int srednee=0;
        int array [] = new int[n];
        random(array);
        printArray(array, n);
        for (int i = 0; i <n-1; i++) {
            summa=summa+array[i+1];

        }
        System.out.println("Сумма:"+summa);
        srednee=summa/n;
        System.out.println("Cреднее значение:"+srednee);

    }



    public static int[] random(int[] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array,int raxmer){
        for (int i = 0; i <raxmer ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
