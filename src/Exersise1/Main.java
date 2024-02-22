package Exersise1;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Введите число");
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();

    if (a > 7) {
      System.out.println("Привет");
    } else {
      return;
    }
  }

}
