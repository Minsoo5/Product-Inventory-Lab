package services;

import models.Sneakers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
          SneakerService ss1 = new SneakerService();

          //When
          Sneakers expected1 = ss1.create("Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);
          Sneakers actual1 = ss1.findSneaker(expected1.getId());

          //Then
          Assertions.assertEquals(expected1, actual1);

      }


    @Test
    public void findAllTest() {
        //Given
        SneakerService ss2 = new SneakerService();
        Sneakers first = ss2.create("Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);
        Sneakers second = ss2.create("Hola", "Crocs", "Kitchen", 7, 100, 45.00f);

        //When
        Sneakers[] expected2 = {first, second};

        //Then
        Assertions.assertEquals(expected2.length, ss2.findAll().length);
        Assertions.assertArrayEquals(expected2, ss2.findAll());

//        Assertions.assertEquals(expected.toString(), ss.findAll().toString());
    }

    @Test
    public void deleteTest() {
        //Given
        SneakerService ss3 = new SneakerService();
        Sneakers first3 = ss3.create("Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);
        Sneakers second3 = ss3.create("Hola", "Crocs", "Kitchen", 7, 100, 45.00f);

        //When
        int expectedSize3 = 1;
        boolean actual3 = ss3.delete(second3.getId());
        boolean expected3 = true;

        //Then
        Assertions.assertEquals(expectedSize3, ss3.findAll().length);
        Assertions.assertEquals(expected3, actual3);

    }
    @Test
    public void deleteTest2() {
        //Given
        SneakerService ss4 = new SneakerService();
        Sneakers first = ss4.create("Crocky", "Crocs", "Kitchen", 8, 100, 50.00f);
        Sneakers second = ss4.create("Hola", "Crocs", "Kitchen", 7, 100, 45.00f);

        //When
        boolean actual4 = ss4.delete(4);
        boolean expected4 = false;
        int expectedSize4 = 2;

        //Then
        Assertions.assertEquals(expectedSize4, ss4.findAll().length);
        Assertions.assertEquals(expected4, actual4);

    }


}