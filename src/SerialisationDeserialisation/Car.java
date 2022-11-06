package SerialisationDeserialisation;

import java.io.Serializable;

public class Car implements Serializable {
private int price;
private String name;

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
