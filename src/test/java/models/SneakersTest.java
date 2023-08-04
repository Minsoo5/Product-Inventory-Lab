package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakersTest {

    Sneakers crocs = new Sneakers(5555, "Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);

    @Test
    void getIdTest() {
        //Given
            //Constructor
        //When
        int expected = 5555;
        int actual = crocs.getId();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setIdTest() {
        //Given
        crocs.setId(90);
        //When
        int expected = 90;
        int actual = crocs.getId();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getName() {
        //Given
        //Constructor
        //When
        String expected = "Crocky";
        String actual = crocs.getName();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        //Given
        crocs.setName("Aligator");
        //When
        String expected = "Aligator";
        String actual = crocs.getName();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getBrandTest() {
        //Given
        //Constructor
        //When
        String expected = "Crocs";
        String actual = crocs.getBrand();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setBrandTest() {
        //Given
        crocs.setBrand("Ali");
        //When
        String expected = "Ali";
        String actual = crocs.getBrand();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSportTest() {
        //Given
        //Constructor
        //When
        String expected = "Kitchen";
        String actual = crocs.getSport();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSportTest() {
        //Given
        crocs.setSport("Beach");
        //When
        String expected = "Beach";
        String actual = crocs.getSport();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSizeTest() {
        //Given
            //Constructor
        //When
        float expected = 8;
        float actual = crocs.getSize();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSizeTest() {
        //Given
        crocs.setSize(8.5f);
        //When
        float expected = 8.5f;
        float actual = crocs.getSize();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getQtyTest() {
        //Given
            //Constructor
        //When
        int expected = 100;
        int actual = crocs.getQty();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setQtyTest() {
        //Given
        crocs.setQty(0);
        //When
        int expected = 0;
        int actual = crocs.getQty();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPriceTest() {
        //Given
            //Constructor
        //When
        float expected = 50.00f;
        float actual = crocs.getPrice();
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPriceTest() {
        //Given
        crocs.setPrice(0);
        //When
        float expected = 0;
        float actual = crocs.getPrice();

        //Then
        Assertions.assertEquals(expected, actual);
    }
}