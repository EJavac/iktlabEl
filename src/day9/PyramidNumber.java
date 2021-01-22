package day9;

import java.util.Scanner;

public class PyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int number = sc.nextInt();

            for (int i = 1; i <= number; i++) {
                for(int a=0; a<number-i; a++){
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                }System.out.println("");

            }
        }
    }
