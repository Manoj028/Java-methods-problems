package questions;

import java.util.Scanner;

public class voteEligibilty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        isValidage(age);
    }
    static void isValidage(int age){
       if(age >= 18){
           System.out.println("Eligible to vote");
       }
       else{
           System.out.println("Not eligible to vote");
       }
    }


}

