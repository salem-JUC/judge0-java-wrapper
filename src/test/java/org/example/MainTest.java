package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5, Main.add(2, 3));
    }
}