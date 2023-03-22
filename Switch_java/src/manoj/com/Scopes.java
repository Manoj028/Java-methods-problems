package manoj.com;

public class Scopes {

    static int x = 90;
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println(x); //90
        int x = 15;
        System.out.println(x); //15
        System.out.println(x);//15
        fun();//90
    }
    static void fun(){

        System.out.println(x);
        int x =16;
        System.out.println(x);
    }




}
