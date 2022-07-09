package org.example;



public class Radio {
    private int radioStationNumber;
    private int currentVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newStationNumber) {

        if (newStationNumber > 9) {
            return;
        }
        radioStationNumber = newStationNumber;

    }

    public int nextStation() {
        radioStationNumber = radioStationNumber + 1;
        if (radioStationNumber > 9) {
            return 0;
        }
        return radioStationNumber;
    }

    public int prevStation() {
        radioStationNumber = radioStationNumber - 1;
        if (radioStationNumber < 0) {
            return 9;
        }
        return radioStationNumber;


    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
