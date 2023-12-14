package Lab1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input age: ");
        int age = in.nextInt();
        System.out.println("Year: ");
        int year = 2023;
        System.out.println( year - age );
    }
}