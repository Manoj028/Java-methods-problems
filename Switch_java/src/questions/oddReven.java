package questions;

import java.util.Scanner;

public class oddReven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        isOddorEven(a);
    }
    static void isOddorEven(int num){
        if(num%2==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num+ " is odd");
        }
    }
}
