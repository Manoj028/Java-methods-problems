package questions;

import java.util.Scanner;

public class Area_Cir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int area = Area(radius);
        System.out.println(area+"π units");
        int circum = Cir(radius);
        System.out.println(circum+"π Square units");

    }
    static int Area(int r){
        double area = 2*r;
        return (int) area;
    }
    static int Cir(int r){
        double cir = r*r;
        return (int) cir;
    }
}
