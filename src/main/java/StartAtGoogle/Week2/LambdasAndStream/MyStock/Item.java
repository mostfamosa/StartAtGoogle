package StartAtGoogle.Week2.LambdasAndStream.MyStock;


import StartAtGoogle.Week2.Generator;

import java.util.Date;

class Item implements Comparable {

    private final String name;
    private final Generator.itemType type;
    private final Date expirationDate;
    private final int weight;

    public Item(String name, Date expirationDate, int weight) {
        this.name = name;
        this.type = Generator.generateRandomType();
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public Enum getType() {
        return type;
    }

    public Date getExpirationDate() {
        return new Date(expirationDate.getTime());
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", expirationDate=" + expirationDate +
                ", weight=" + weight +
                '}'+'\n';
    }


    //compare to according to expiration date
    @Override
    public int compareTo(Object item) {
        long thisDate = getMillisOf(this);
        long anotherDate = getMillisOf((Item) item);
        return (thisDate < anotherDate ? -1 : (thisDate == anotherDate ? 0 : 1));
    }

    private long getMillisOf(Item item) {
        return item.expirationDate.getTime();
    }
}
