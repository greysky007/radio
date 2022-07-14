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

    public void setNextNumStation() {
        if (numStation == maxStat) {
            numStation = minStat;
        } else {
            this.numStation = numStation + 1;
        }


    }


    public void setPreviousNumStation() {
        if (numStation == minStat) {
            numStation = maxStat;
        } else {
            this.numStation = numStation - 1;
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


