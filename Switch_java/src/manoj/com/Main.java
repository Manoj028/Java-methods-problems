package manoj.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case ("Mango") -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Sweet fruit");
            case "Orange" -> System.out.println("Tanngy Fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}