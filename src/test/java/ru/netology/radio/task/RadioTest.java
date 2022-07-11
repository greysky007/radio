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

    //nextstation
    @Test
    public void shouldSetNextStationsMax() {
        Radio rad = new Radio();
        rad.setNextNumStation(9);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNextStationsBelowMax() {
        Radio rad = new Radio();
        rad.setNextNumStation(8);
        int expected = 9;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationsAboveMax() {
        Radio rad = new Radio();
        rad.setNextNumStation(10);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationsMin() {
        Radio rad = new Radio();
        rad.setNextNumStation(0);
        int expected = 1;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationsAboveMin() {
        Radio rad = new Radio();

        rad.setNextNumStation(1);
        int expected = 2;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationsBelowMin() {
        Radio rad = new Radio();
        rad.setNextNumStation(-1);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPreviousStationsAboveMax() {
        Radio rad = new Radio();
        rad.setNumStation(9);
        rad.setPreviousNumStation();
        int expected = 8;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationsAboveMin() {
        Radio rad = new Radio();
        rad.setNumStation(0);
        rad.setPreviousNumStation();
        int expected = 9;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderLimit() {
        Radio rad = new Radio();
        rad.setNumStation(10);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderLimitMinus() {
        Radio rad = new Radio();
        rad.setNumStation(-1);
        int expected = 0;
        int actual = rad.getNumStation();
        Assertions.assertEquals(expected, actual);
    }

    //volume test
    //increase
    @Test
    public void shouldIncreaseVolAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Decreasing
    @Test
    public void shouldDecreaseVolMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolBelowMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.decreaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.decreaseVolume();
        int expected = 9;
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

    @Test
    public void shouldDecreaseVolBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

