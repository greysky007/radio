package ru.netology.radio.task;

public class Radio {
    private int numStation;
    private int currentVolume;
    private int maxVol = 100;
    private int minVol = 0;
    private int minStat = 0;
    private int maxStat = 9;
    private int amount = 11;

    public Radio() {
    }

    public Radio(int amount) {
        this.amount = amount;
        this.maxStat = minStat + amount - 1;
    }

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
        if (newVol > maxVol) {
            return;
        }
        if (newVol < minVol) {
            return;
        }
        currentVolume = newVol;
    }

    public void increaseVolume() {
        if (currentVolume == maxVol) {
            return;
        }
        currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVol) {
            return;
        }
        currentVolume -= 1;
    }
}


