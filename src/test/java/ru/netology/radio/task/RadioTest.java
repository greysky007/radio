package ru.netology.radio.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetStationMax() {
        Radio rad = new Radio();
        rad.setNumStation(9);

        int expected = 9;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMax() {
        Radio rad = new Radio();
        rad.setNumStation(8);
        int expected = 8;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio rad = new Radio();
        rad.setNumStation(10);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMin() {
        Radio rad = new Radio();
        rad.setNumStation(0);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio rad = new Radio();
        rad.setNumStation(-1);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMin() {
        Radio rad = new Radio();
        rad.setNumStation(1);
        int expected = 1;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    //nextStation
    @Test
    public void shouldSetNextStationsMax() {
        Radio rad = new Radio();
        rad.setNumStation(9);
        rad.setNextNumStation();
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationsBelowMax() {
        Radio rad = new Radio();
        rad.setNumStation(8);
        rad.setNextNumStation();
        int expected = 9;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationsMin() {
        Radio rad = new Radio();
        rad.setNumStation(0);
        rad.setNextNumStation();
        int expected = 1;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationsAboveMin() {
        Radio rad = new Radio();
        rad.setNumStation(1);
        rad.setNextNumStation();
        int expected = 2;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }


//previousStation

    @Test
    public void shouldSetPreviousStationsMax() {
        Radio rad = new Radio();
        rad.setNumStation(9);
        rad.setPreviousNumStation();
        int expected = 8;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationsBelowMax() {
        Radio rad = new Radio();
        rad.setNumStation(8);
        rad.setPreviousNumStation();
        int expected = 7;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationsMin() {
        Radio rad = new Radio();
        rad.setNumStation(0);
        rad.setPreviousNumStation();
        int expected = 9;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationsAboveMin() {
        Radio rad = new Radio();
        rad.setNumStation(1);
        rad.setPreviousNumStation();
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }


    //volumeTest
    //increase
    @Test
    public void shouldIncreaseVolAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //setCurrentVolume
    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //increase
    @Test
    public void shouldIncreaseVolAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolBelowMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Decreasing
    @Test
    public void shouldDecreaseVolMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolBelowMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.decreaseVolume();
        int expected = 98;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    //amount
    @Test
    public void shouldSetNextStationAmountMax() {
        Radio rad = new Radio(10);
        rad.setNumStation(9);
        rad.setNextNumStation();
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetNextStationAmountMin() {
        Radio rad = new Radio(10);
        rad.setNumStation(0);
        rad.setNextNumStation();
        int expected = 1;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetPreviousStationAmountMin() {
        Radio rad = new Radio(10);
        rad.setNumStation(0);
        rad.setPreviousNumStation();
        int expected = 9;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetPreviousStationAmountMax() {
        Radio rad = new Radio(10);
        rad.setNumStation(9);
        rad.setPreviousNumStation();
        int expected = 8;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);


    }
}

