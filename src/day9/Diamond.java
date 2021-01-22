package day9;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int a = 0; a < number - i; a++) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
            for (int ii = number; ii >= 1; i++) {
              //  for (int aa = 0; aa > number - i; aa--) {
                    System.out.print("-");
                }
                //for (int jj = 0; jj < ii; jj++) {
                    //System.out.print("*" + " ");
                //}
               // System.out.println("");

            }
        }
    }
//}