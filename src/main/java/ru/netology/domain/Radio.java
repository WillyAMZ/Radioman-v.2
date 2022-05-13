package ru.netology.domain;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minRadioStation) {
            return;
        }
        if (currentStation > maxRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == maxRadioStation) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPrevStation() {
        if (currentStation == minRadioStation) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }


    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}