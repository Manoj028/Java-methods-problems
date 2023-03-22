package questions;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Maximum(a,b,c);
        Minimum(a,b,c);
    }
    static void Maximum(int a,int b,int c){
        int max = Math.max( c, Math.max(a,b));
        System.out.println(max);
    }
    static void Minimum(int a,int b,int c){
        int max = Math.min( c, Math.min(a,b));
        System.out.println(max);
    }
}
