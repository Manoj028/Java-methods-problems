package manoj.com;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void greeting(){
        System.out.println("Hello world");
    }
}
