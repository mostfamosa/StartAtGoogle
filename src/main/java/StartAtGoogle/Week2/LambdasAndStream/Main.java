package StartAtGoogle.Week2.LambdasAndStream;

import StartAtGoogle.Week2.LambdasAndStream.MyStock.Stock;

public class Main {
    public static void main(String[] args) {
        Stock myStock = new Stock();
        System.out.println(myStock);

        System.out.println("\nExpired Items:\n");
        System.out.println(myStock.getExpiredItems());

        System.out.println("\nClosest Expired Date Item:\n");
        System.out.println(myStock.getClosestExpiredItems());

        System.out.println("\nSort Items Alphabetically:\n");
        System.out.println(myStock.sortItemsAlpha());

        System.out.println("\nfind Item by name = Mostafa:\n");
        System.out.println(myStock.getItemByName("Mostafa"));

        System.out.println("\nList of Items Name :\n");
        System.out.println(myStock.getNamesAboveWeight(50));

        System.out.println("\nEach Type and It's Count :\n");
        System.out.println(myStock.getSumOfItemsAccordingToType());


    }
}
