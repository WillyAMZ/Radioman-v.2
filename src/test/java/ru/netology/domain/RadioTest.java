package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldGetCurrentStation() {
        int expected = 4;
        radio.setCurrentStation(expected);

        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    void shouldSetNextStation() {
        int station = 7;
        int expected = 8;

        radio.setCurrentStation(station);
        radio.setNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStation() {
        int station = 6;
        int expected = 5;

        radio.setCurrentStation(station);
        radio.setPrevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseAboveNineStation() {
        int station = 9;
        int expected = 0;

        radio.setCurrentStation(station);
        radio.setNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseBelowZeroStation() {
        int station = 0;
        int expected = 9;

        radio.setCurrentStation(station);
        radio.setPrevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldCheckLimitUp() {
        int station = -1;
        int expected = 0;

        radio.setCurrentStation(station);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldCheckLimitDown() {
        int station = 10;
        int expected = 0;

        radio.setCurrentStation(station);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldGetCurrentVolume() {
        int volume = 7;
        int expected = 7;

        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUp() {
        int volume = 4;
        int expected = 5;

        radio.setCurrentVolume(volume);
        radio.volumeUp();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        int volume = 7;
        int expected = 6;

        radio.setCurrentVolume(volume);
        radio.volumeDown();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp() {
        int volume = 10;
        int expected = 10;

        radio.setCurrentVolume(volume);
        radio.volumeUp();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown() {
        int volume = 0;
        int expected = 0;

        radio.setCurrentVolume(volume);
        radio.volumeDown();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp() {
        int volume = 11;
        int expected = 0;

        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown() {
        int volume = -1;
        int expected = 0;

        radio.setCurrentVolume(volume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}