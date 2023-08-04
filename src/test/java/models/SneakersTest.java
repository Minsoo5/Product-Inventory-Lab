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
    void setBrand() {
        //Given

        //When

        //Then
    }

    @Test
    void getSport() {
        //Given

        //When

        //Then
    }

    @Test
    void setSport() {
        //Given

        //When

        //Then
    }

    @Test
    void getSize() {
        //Given

        //When

        //Then
    }

    @Test
    void setSize() {
        //Given

        //When

        //Then
    }

    @Test
    void getQty() {
        //Given

        //When

        //Then
    }

    @Test
    void setQty() {
        //Given

        //When

        //Then
    }

    @Test
    void getPrice() {
        //Given

        //When

        //Then
    }

    @Test
    void setPrice() {
        //Given

        //When

        //Then
    }
}