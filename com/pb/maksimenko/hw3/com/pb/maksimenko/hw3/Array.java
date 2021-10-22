package com.pb.maksimenko.hw3;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив из 10 чисел через Enter");
        int array[] = new int[10];
        int sum=0;        
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if ( array[i] > 0) {
                counter++;    
            }  
        }  
        for( int num : array) {
            sum = sum +num;
        }
        System.out.println( "Ваш массив: ");
        for (int i = 0; i < array.length; i++){
        System.out.print( array[i]+ " ");
        }
        System.out.println();
        System.out.println("Сумма массива : " + sum);
                                 
        System.out.println("Количество положительных елементов массива: " +counter);
        
        System.out.println("Отсортированный массив по алгоритму сортировки пузырьком: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int buffer = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = buffer;         
                }
            }
        System.out.print(array[i]+" ");
        }   
    }
}    
