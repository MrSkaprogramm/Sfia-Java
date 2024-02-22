package Exersise2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Введите имя");
    String b = "Вячеслав";
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    
    if(a.equals(b)) {
      System.out.println("Привет, Вячеслав");
    } else {
      System.out.println("Нет такого имени");
    }
  }

}
