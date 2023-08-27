package models;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class WhiskeyTest {

    @Test
    void constructorTest() {
        //Given
        Whiskey jefferson = new Whiskey(123, "Jefferson", "Jefferson", 35, 15, 34.99f);

        //When
        int expectedId = 123;
        String expectedName = "Jefferson";
        String expectedBrand = expectedName;
        int expectedYears = 35;
        int expectedQty = 15;
        float expectedPrice = 34.99f;

        //Then

        Assert.assertEquals(expectedId, jefferson.getId());
        Assert.assertEquals(expectedName, jefferson.getName());
        Assert.assertEquals(expectedBrand, jefferson.getBrand());
        Assert.assertEquals(expectedYears, jefferson.getYearsAged());
        Assert.assertEquals(expectedQty, jefferson.getQty());
        Assert.assertTrue(expectedPrice == jefferson.getPrice());

    }


    @Test
    void setAndGetTest() {
        //Given
        Whiskey jefferson = new Whiskey(123, "Jefferson", "Jefferson", 35, 15, 34.99f);

        //When
        int expectedId = 10;
        jefferson.setId(expectedId);

        String expectedName = "Jameson";
        jefferson.setName(expectedName);

        String expectedBrand = expectedName;
        jefferson.setBrand(expectedBrand);

        int expectedYears = 20;
        jefferson.setYearsAged(expectedYears);

        int expectedQty = 30;
        jefferson.setQty(expectedQty);

        float expectedPrice = 24.99f;
        jefferson.setPrice(expectedPrice);


        //Then

        Assert.assertEquals(expectedId, jefferson.getId());
        Assert.assertEquals(expectedName, jefferson.getName());
        Assert.assertEquals(expectedBrand, jefferson.getBrand());
        Assert.assertEquals(expectedYears, jefferson.getYearsAged());
        Assert.assertEquals(expectedQty, jefferson.getQty());
        Assert.assertTrue(expectedPrice == jefferson.getPrice());

    }


}