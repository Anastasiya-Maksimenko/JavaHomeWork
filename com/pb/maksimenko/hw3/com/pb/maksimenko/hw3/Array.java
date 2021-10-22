package com.pb.maksimenko.hw3;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];
        int sum;
        for (int i = 0; i < mas.length; i++) {
        mas[i] = input.nextInt();
        }        
        for( int num : mas) {
            sum = sum +num;
          }
           System.out.println("Сумма массива : " + sum);
          }

    }
