package LabSE;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Info ice = new Info("kawin","ruangrit",24);
        Account ice2 = new Account(50);
        Scanner scan = new Scanner(System.in);
        System.out.println(ice.toString());

        System.out.print("How many did you get money? = ");
        int a = scan.nextInt();
        System.out.println("balance your money = " + ice2.income(a));

        System.out.print("How many did you spand your money = ");
        int b = scan.nextInt();
        System.out.println("you spand your money = " + ice2.expane(b));


    }




}
