package Lab1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number1 = in.nextInt();
        System.out.print("Введите в второе число: ");
        int number2 = in.nextInt();
        System.out.println(+ number1 + number2);
        System.out.println( number1  -  number2);
    }
}