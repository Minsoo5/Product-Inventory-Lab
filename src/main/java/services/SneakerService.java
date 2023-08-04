package services;

import models.Sneakers;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;
    private List<Sneakers> inventory = new ArrayList<Sneakers>();

    // create, read, update, and delete

    public Sneakers create(String name, String brand, String sport, float size, int qty, float price) {
        Sneakers newSneakers = new Sneakers(nextId++, name, brand, sport, size, qty, price);
        inventory.add(newSneakers);
        return newSneakers;
    }

    //read, update, and delete

    public Sneakers findSneaker(int id) {
        for (Sneakers s : inventory) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public Sneakers[] findAll() {
        Sneakers[] clone = new Sneakers[inventory.size()];
        return inventory.toArray(clone);
    }

    public boolean delete(int id) {


        return false;
    }

}
