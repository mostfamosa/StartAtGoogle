package StartAtGoogle.Week2.ClassesAndInterfaces;

import StartAtGoogle.Week2.Generator;

class Animal {
    public Animal(int id, int weight, String gender,String animalType) {
        this.id = id;
        this.weight = weight;
        this.gender = gender;
        this.animalType=animalType;
    }

    public Animal() {

    }
    protected int id;
    protected int weight;
    protected String gender;
    protected String animalType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", animalType='" + animalType + '\'' +
                '}';
    }

    public void move() {
    }
}


