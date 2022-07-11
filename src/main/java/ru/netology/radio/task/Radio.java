package ru.netology.radio.task;

public class Radio {
    private int numStation;
    private int currentVolume;
    private int maxVol = 10;
    private int minVol = 0;
    private int minStat = 0;
    private int maxStat = 9;

    public int getNumStation() {
        return numStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumStation(int newNum) {
        if (newNum >= minStat && newNum <= maxStat) {
            numStation = newNum;
        }
    }

    public void setNextNumStation(int current) {
        if (current < maxStat && current >= minStat) {

            numStation = current + 1;
        }
        if (current == maxStat) {
            numStation = minStat;

        }
    }


    public void setPreviousNumStation() {
        if (numStation > minStat) {
            numStation = numStation - 1;
        }
        if (numStation == 0) {
            numStation = maxStat;
        }
    }

    public void setCurrentVolume(int newVol) {

        currentVolume = newVol;

    }

    public void increaseVolume() {
        if (currentVolume < maxVol) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > maxVol) {
            currentVolume = maxVol - 1;
        } else {
            currentVolume = currentVolume - 1;
        }

        if (currentVolume <= minVol) {
            currentVolume = minVol;
        }


    }

}


