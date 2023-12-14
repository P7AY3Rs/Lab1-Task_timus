package Lab1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input year:");
        int year = in.nextInt();
        System.out.println("Input age:");
        int age = in.nextInt();
        System.out.println(year-age);
    }
}