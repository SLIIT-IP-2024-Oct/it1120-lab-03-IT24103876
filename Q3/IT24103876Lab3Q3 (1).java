import java.util.Scanner;
public class IT24103876Lab3Q3 {
    public static void main(String[] args) {
        Scanner rupee = new Scanner(System.in);
        System.out.print("Enter the Rupee amount: ");
        double amount = rupee.nextDouble();
        if (amount >= 5000) {
            int a = (int)(amount / 5000);
            amount = amount % 5000;
            System.out.println("5000 Notes: " + a);
        }
        if (amount >= 1000) {
            int b = (int)(amount / 1000);
            amount = amount % 1000;
            System.out.println("1000 Notes: " + b);
        }
        if (amount >= 500) {
            int c = (int)(amount / 500);
            amount = amount % 500;
            System.out.println("500 Notes: " + c);
        }
        if (amount >= 200) {
            int d = (int)(amount / 200);
            amount = amount % 200;
            System.out.println("200 Notes: " + d);
        }
        if (amount >= 100) {
            int e = (int)(amount / 100);
            amount = amount % 100;
            System.out.println("100 Notes: " + e);
        }
        if (amount >= 50) {
            int f = (int)(amount / 50);
            amount = amount % 50;
            System.out.println("50 Notes: " + f);
        }
        if (amount >= 20) {
            int g = (int)(amount / 20);
            amount = amount % 20;
            System.out.println("20 Notes: " + g);
        }
        if (amount >= 10) {
            int h = (int)(amount / 10);
            amount = amount % 10;
            System.out.println("10 Notes: " + h);
        }
        if (amount >= 5) {
            int i = (int)(amount / 5);
            amount = amount % 5;
            System.out.println("5 Notes: " + i);
        }
        if (amount >= 2) {
            int j = (int)(amount / 2);
            amount = amount % 2;
            System.out.println("2 Notes: " + j);
        }
        if (amount >= 1) {
            int k = (int)amount;  
            System.out.println("1 Notes: " + k);
        }
    }
}
 