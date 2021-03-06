package com.codeclan.gladiators;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/08/2017.
 */

public class GladiatorTest {

    Gladiator gladiator;

    @Before
    public void before() {
        gladiator = new Gladiator(1,"Maximus", 10, "232BC");
    }

    @Test
    public void canGetName() {
        assertEquals("Maximus", gladiator.getName());
    }

    @Test
    public void canGetWins() {
        assertEquals(10, gladiator.getWins());
    }

    @Test
    public void canGetDob() {
        assertEquals("232BC", gladiator.getDob());
    }

    @Test
    public void canGetRanking(){
        assertEquals(1, gladiator.getRanking());
    }
}