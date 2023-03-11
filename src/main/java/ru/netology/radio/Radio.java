package ru.netology.radio;

public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public void next() {
        if (currentRadioStationNumber != 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }

    }

    public void prev() {
        if (currentRadioStationNumber != 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }

    }

    public void changeVolumeUp() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }

    }

    public void changeVolumeLow() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
