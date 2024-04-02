package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();
//        double Pi = 3.14;
        double area = Circle.getArea(radius);
        System.out.println("The area of a cricle with a radius of " + radius + " is: " + area);



        input.close();
    }
}
