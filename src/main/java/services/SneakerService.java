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
        // sneakers [1, 2, 3, 4, 5,]
        // remove          3
        // sneakers [1, 2, n, 4, 5]
        // turns to [1, 2, 4, 5]
        // should remove the object with this id from the ArrayList if exits and return true.
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId() == id) {
                inventory.remove(i);
//                for (int j = i + 1; j < inventory.size() -1; j++) {
//                    inventory.set(i, inventory.get(j)); //move all the elements towards the left by one
//                    inventory.remove(inventory.size()-1);   //cut off the last element; always a duplicate
//                }
//                this.inventory = inventory;
                return true;
            }
        }
        return false;
    }

}
