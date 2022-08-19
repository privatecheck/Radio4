package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio ();

    @Test
    void setRadioStation() {

        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }
    @Test
    void setStationBelowZero() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setStationAboveNine() {
        radio.setCurrentStation(10);
        radio.next();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void setPreviousStation() {
        radio.setCurrentStation(4);
        radio.previous();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void setStationBelowOne() {
        radio.setCurrentStation(0);
        radio.previous();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void overLimitVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void setBelowZeroVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}