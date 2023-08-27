package services;

import models.Whiskey;
import org.hibernate.mapping.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WhiskeyService extends ArrayList<Whiskey> {

    private static int nextId = 1;

    private ArrayList<Whiskey> inventory = new ArrayList<>();

    //create
    public Whiskey create(int id, String name, String brand, int yearsAged, int qty, float price) {
        Whiskey whiskey = new Whiskey(nextId++, name, brand, yearsAged, qty, price);
        inventory.add(whiskey);
        return whiskey;

    }

    //read
    public Whiskey findWhiskey(int id) {
        Whiskey whiskey = this.inventory.stream()
                .filter(w -> w.getId() == id)
                .findFirst()
                .orElse(null);

        return whiskey;
//        for (Whiskey w : this.inventory) {
//            if (w.getId() == id) {
//                return w;
//            }
//        }
//        return null;
    }

    public Whiskey[] findAllWhiskey() {
         Whiskey[] result = this.inventory.toArray(Whiskey[]::new);
         return result;
    }

    public int size(){
        int counter = 0;
        for (Whiskey w : this.inventory) {
            counter++;
        }
        return counter;
    }

    public void addWhiskey(Whiskey whiskey) {
        this.inventory.add(whiskey);

    }
}
