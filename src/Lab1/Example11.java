package Lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input year: ");
        int year = in.nextInt();
        System.out.println("Name:" + " " + name +  " " + "Year:"+ " " + year);
    }
}
