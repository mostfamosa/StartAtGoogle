package StartAtGoogle.Week2.LambdasAndStream.MyStock;

import StartAtGoogle.Week2.Generator;

import java.util.*;
import java.util.stream.Collectors;


public class Stock {
    private ArrayList<Item> stockItems = new ArrayList<>();

    public Stock() {
        for (int i = 0; i < 10 ; i++)
            generateAndAddItem();
    }

    public void generateAndAddItem(){
        String name = Generator.generateRandomRealNames(1).get(0);
        Date ExpDate = Generator.generateRandomDate();
        int weight = Generator.generateRandomWeight();
        Item item = new Item(name,ExpDate,weight);

        stockItems.add(item);
    }

    public List<Item> getExpiredItems(){
        Date now = new Date(new Date().getTime());
        List<Item> result;
        result = stockItems.stream().filter(item -> item.getExpirationDate().before(now)).collect(Collectors.toList());
        return result;
    }

    public Item getClosestExpiredItems() {
        Date now = new Date(new Date().getTime());
        Item result;
        result = stockItems.stream().filter(item -> item.getExpirationDate().after(now)).sorted().findFirst().get();
        return result;
    }

    public List<Item> sortItemsAlpha(){
        List<Item> result;
        result = stockItems.stream().sorted(Comparator.comparing(Item::getName)).collect(Collectors.toList());
        return result;
    }

    public Item getItemByName(String itemName){
        Item result;
        result = stockItems.stream()
                .filter(item -> itemName.equals(item.getName()))
                .findFirst().orElse(null);
        return result;
    }

    public List<String> getNamesAboveWeight(int weight){

        List<String> result;
        List<Item> newList;

        newList=  stockItems.stream()
                .filter(item->item.getWeight()>weight)
                .collect(Collectors.toList());

        result = newList.stream().map(Item::getName).collect(Collectors.toList());
        return result;
    }

    public Map<Enum, Long> getSumOfItemsAccordingToType(){

        Map<Enum, Long> result = stockItems.stream()
                .collect(Collectors.groupingBy(item -> item.getType(), Collectors.counting()));

        return result;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockItems=\n" + stockItems +
                '}'+'\n';
    }
}
