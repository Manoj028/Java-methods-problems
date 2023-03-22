package questions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int factorial = 1;
        for(int i = 1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }

}
