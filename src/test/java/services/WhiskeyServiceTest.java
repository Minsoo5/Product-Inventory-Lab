package services;

import models.Whiskey;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyServiceTest {

    @Test
    void create() {
        //Given
        WhiskeyService ws = new WhiskeyService();
        ws.create(123, "Jefferson", "Jefferson", 35, 15, 34.99f);

        //When
        int expectedSize = 1;

        //Then
        Assert.assertEquals(expectedSize, ws.size());

    }

    @Test
    void findWhiskey() {
        //Given
        Whiskey whiskey1 = new Whiskey(111, "Jefferson", "Jefferson", 35, 15, 34.99f);
        Whiskey whiskey2 = new Whiskey(222, "Jameson", "Jameson", 20, 30, 24.99f);
        Whiskey whiskey3 = new Whiskey(333, "Makers", "Makers", 18, 30, 22.99f);

        //When
        WhiskeyService ws = new WhiskeyService();
        ws.addWhiskey(whiskey1);
        ws.addWhiskey(whiskey2);
        ws.addWhiskey(whiskey3);

        Whiskey expecteWhiskey = whiskey1;
        Whiskey actualWhiskey = ws.findWhiskey(111);

        //Then
        Assert.assertEquals(whiskey1, actualWhiskey);

    }

    @Test
    void findAllWhiskey() {
        //Given
        Whiskey whiskey1 = new Whiskey(111, "Jefferson", "Jefferson", 35, 15, 34.99f);
        Whiskey whiskey2 = new Whiskey(222, "Jameson", "Jameson", 20, 30, 24.99f);
        Whiskey whiskey3 = new Whiskey(333, "Makers", "Makers", 18, 30, 22.99f);

        //When
        WhiskeyService ws = new WhiskeyService();
        ws.addWhiskey(whiskey1);
        ws.addWhiskey(whiskey2);
        ws.addWhiskey(whiskey3);

        Whiskey[] expected = {whiskey1, whiskey2, whiskey3};

        //Then
        Assert.assertEquals(expected, ws.findAllWhiskey());

    }
}