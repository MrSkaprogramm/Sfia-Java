package Exersise3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество чисел в массиве\n");
    int a = sc.nextInt();
    int[] massive = new int[a];
    System.out.println("Введите числа массива\n");

    for (int i = 0; i < massive.length; i++) {
      System.out.println("Введите число:\n");
      massive[i] = sc.nextInt();
    }

    System.out.println("Числа массива, кратные 3:\n");

    for (int i = 0; i < massive.length; i++) {
      if (massive[i] % 3 == 0) {
        System.out.println("Число " + massive[i] + " в массиве кратно 3\n");
      }
    }
  }
}
