package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter in the radius of the circle: ");
        int radius = scanner.nextInt();
        System.out.println("The radius of the circle is " + ((2 * pi) * radius));


    }
}