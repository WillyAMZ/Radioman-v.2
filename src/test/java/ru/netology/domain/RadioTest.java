package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldGetCurrentStation() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int expected = 4;
        radio.setCurrentStation(expected);

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(10, 100, 0, 7, 100);
        int station = 7;
        int expected = 8;

        radio.setCurrentStation(station);
        radio.setNextStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio();
        int station = 6;
        int expected = 5;

        radio.setCurrentStation(station);
        radio.setPrevStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseAboveNineStation() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int station = 9;
        int expected = 0;

        radio.setCurrentStation(station);
        radio.setNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseBelowZeroStation() {
        Radio radio = new Radio(10, 100, 0, 0, 100);
        int station = 0;
        int expected = 9;

        radio.setCurrentStation(station);
        radio.setPrevStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldCheckLimitUp() {
        Radio radio = new Radio(10, 100, 0, 0, 100);
        int station = -1;
        int expected = 0;

        radio.setCurrentStation(station);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldCheckLimitDown() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int station = 10;
        int expected = 9;

        radio.setCurrentStation(station);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldGetCurrentVolume() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int volume = 70;
        int expected = 70;

        radio.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int volume = 40;
        int expected = 41;

        radio.setCurrentVolume(volume);
        radio.volumeUp();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int volume = 70;
        int expected = 69;

        radio.setCurrentVolume(volume);
        radio.volumeDown();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int volume = 100;
        int expected = 100;

        radio.setCurrentVolume(volume);
        radio.volumeUp();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int volume = 0;
        int expected = 0;

        radio.setCurrentVolume(volume);
        radio.volumeDown();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp() {
        Radio radio = new Radio(10, 100, 0, 9, 100);
        int volume = 101;
        int expected = 100;

        radio.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown() {
        Radio radio = new Radio(10, 100, 0, 9, 0);
        int volume = -1;
        int expected = 0;

        radio.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}