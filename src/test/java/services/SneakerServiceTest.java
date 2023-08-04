package services;

import models.Sneakers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SneakerServiceTest {

        @Test
        public void createTest(){

            // (1)
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedSport = "Tennis";
            float expectedSize = 10.5f;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            // (2)
            SneakerService sneakerService = new SneakerService();
            Sneakers testSneaker = sneakerService.create(expectedName, expectedBrand,
                    expectedSport, expectedSize, expectedQty, expectedPrice);

            // (3)
            int actualId = testSneaker.getId();
            String actualName = testSneaker.getName();
            String actualBrand = testSneaker.getBrand();
            String actualSport = testSneaker.getSport();
            float actualSize = testSneaker.getSize();
            int actualQty = testSneaker.getQty();
            float actualPrice = testSneaker.getPrice();

            // (4)
            Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
            Assertions.assertEquals(expectedName, actualName);
            Assertions.assertEquals(expectedBrand, actualBrand);
            Assertions.assertEquals(expectedSport, actualSport);
            Assertions.assertEquals(expectedSize, actualSize);
            Assertions.assertEquals(expectedQty, actualQty);
            Assertions.assertEquals(expectedPrice, actualPrice);

        }

      @Test
      public void findSneakerTest() {
            //Given
          SneakerService ss = new SneakerService();

          //When
          Sneakers expected = ss.create("Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);
          Sneakers actual = ss.findSneaker(1);

          //Then
          Assertions.assertEquals(expected, actual);

      }


    @Test
    public void findAllTest() {
        //Given
        SneakerService ss = new SneakerService();
        Sneakers first = ss.create("Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);
        Sneakers second = ss.create("Hola", "Crocs", "Kitchen", 7, 100, 45.00f);

        //When
        Sneakers[] expected = {first, second};

        //Then
        Assertions.assertEquals(expected.length, ss.findAll().length);
        Assertions.assertArrayEquals(expected, ss.findAll());

//        Assertions.assertEquals(expected.toString(), ss.findAll().toString());
    }

    public void deleteTest() {
        //Given

        //When

        //Then
    }


}