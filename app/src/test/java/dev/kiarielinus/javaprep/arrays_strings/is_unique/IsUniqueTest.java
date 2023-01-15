package dev.kiarielinus.javaprep.arrays_strings.is_unique;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsUniqueTest {

    @Test
    public void return_false_when_not_unique() {
        IsUnique isUnique = new IsUnique();
        boolean val = isUnique.isUniqueChars("Ball");
        assertFalse(val);
    }

    @Test
    public void return_false_when_capitalised_not_unique() {
        IsUnique isUnique = new IsUnique();
        boolean val = isUnique.isUniqueChars("Bob");
        assertFalse(val);
    }

    @Test
    public void return_true_when_unique() {
        IsUnique isUnique = new IsUnique();
        boolean val = isUnique.isUniqueChars("Blue");
        assertTrue(val);
    }


    @Test
    public void return_false_when_not_unique2() {
        IsUnique isUnique = new IsUnique();
        boolean val = isUnique.isUniqueChars2("Ball");
        assertFalse(val);
    }

    @Test
    public void return_false_when_capitalised_not_unique2() {
        IsUnique isUnique = new IsUnique();
        boolean val = isUnique.isUniqueChars2("Bob");
        assertFalse(val);
    }

    @Test
    public void return_true_when_unique2() {
        IsUnique isUnique = new IsUnique();
        boolean val = isUnique.isUniqueChars2("Blue");
        assertTrue(val);
    }
}
