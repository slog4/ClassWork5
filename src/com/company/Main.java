package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        task7();
//        task6();
        int [][] array = new int[5][18];
        for (int row = 0; row < array.length; row++) {
            for (int colum = 0; colum < array[row].length; colum++) {
                array[row][colum] = (int) (Math.random() * 10);
            }
        }

        int [][] temp = new int[5][18];
        int n = 0;
//        temp = array.clone();
        for (int rows= 0; rows < array.length; rows++) {
            for (int column = 0; column < ((array[rows].length)/2); column++) {
                temp[rows][n]= array[rows][column];
                n+=2;
            }
        }
        print(array);
        System.out.println(" ");
        print(temp);

    }

    private static void print(int[][] array) {
        for (int rows = 0; rows < array.length; rows++){
            for (int column = 0; column < array[rows].length ; column++) {
                System.out.print( array[rows][column]+"\t");
            }
            System.out.println(" ");
        }
    }

    private static void task6() {
        int[][] array = new int[5][5];
        int a = 3;
        int b = 5;
        for (int row = 0; row < 5; row++) {
            for (int colum = 0; colum < 5; colum++) {
                array[row][colum] = (int) ((Math.random() * 100) - 50);
            }
        }
        System.out.println(Arrays.deepToString(array));
        int temp = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int column = 0; column < array[rows].length ; column++) {
                if(array[rows][column]%2 != 0){
                    temp+=array[rows][column];
                }
            }

        }
        System.out.println("Сумма не четных равна: "+temp);
        temp=0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int column = 0; column < array[rows].length ; column++) {
                if(array[rows][column] > 0){
                    temp++;
                }
            }

        }
        System.out.println("Количество положительных элементов : "+temp);
        temp=0;
        for (int rows = 0; rows < array.length; rows++) {
                for (int column = 0; column < array[rows].length ; column++) {
                    if(array[rows][column]%a == 0 || array[rows][column]%b == 0){
                        temp++;
                    }
                }

            }
        System.out.println(" чисел кратных 3 или 5: "+temp);
    }

    private static void task7() {
        int[][] array = new int[4][3];
        for (int row = 0; row < 4; row++) {
            for (int colum = 0; colum < 3; colum++) {
                array[row][colum] = (int) (Math.random() * 10);
            }
        }
        for (int rows = 0; rows < 4; rows++) {
            for (int colum = 0; colum < 3; colum++) {
                System.out.print(array[rows][colum] +"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int temp = 0;
        for (int colum = 0; colum < 3; colum++) {
            temp = array[0][colum];
            array[0][colum] = array[1][colum];
            array[1][colum]=temp;
            temp = array[2][colum];
            array[2][colum] = array[3][colum];
            array[3][colum]=temp;
        }
        for (int rows = 0; rows < 4; rows++) {
            for (int colum = 0; colum < 3; colum++) {
                System.out.print(array[rows][colum] +"\t");
            }
            System.out.println(" ");
        }
    }
}

