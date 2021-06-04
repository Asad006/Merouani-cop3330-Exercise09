/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
package org.example;


import java.util.Scanner;

public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        App app = new App();

        int area;
        area = app.getRoomarea(scanner);
        processNeedGalons(area);

    }

    private static void processNeedGalons(int area) {
        final float galonsPerFeet = 350.0f;

        int neededGallons= (int)Math.ceil(area/galonsPerFeet);

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.",neededGallons,area);
    }

    private int getRoomarea(Scanner scanner) {
        int len, width;

        System.out.println(" Enter the length of the room");
        len= Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter the width of the room");
        width= Integer.parseInt(scanner.nextLine());
        return len*width;
    }
}
