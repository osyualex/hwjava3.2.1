package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void testChangeStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.next();
        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationNextEnd() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationPrevEnd() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tastChangeVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.changeVolumeUp();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tastChangeVolumeUpEnd() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.changeVolumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tastChangeVolumeLow() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.changeVolumeLow();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tastChangeVolumeLowEnd() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.changeVolumeLow();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(3);

        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentStationNumberTen() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentStationNumberNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentVolumeHigh() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }



}
