package services;

import models.Sneakers;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;
    private List<Sneakers> inventory = new ArrayList<Sneakers>();

    public Sneakers create(String name, String brand, String sport, float size, int qty, float price) {
        Sneakers newSneakers = new Sneakers(nextId++, name, brand, sport, size, qty, price);
        return newSneakers;
    }



}
