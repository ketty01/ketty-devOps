package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Larry", "Joel", "5162738", 7777777, 21, "Simon Lopez", "Single", "Vasquez", "Oruro");

    }

    @Test
    public void canConstructAPersonWithAName() {
        assertEquals("Larry", person.getName());
    }

    @Test
    public void testLastName() {
        assertEquals("Joel", person.getLastName());
    }

    @Test
    public void test_ci() {
        assertEquals("5162738", person.getCi());
    }

    @Test
    public void test_age() {
        assertEquals(21, person.getAge());
    }

    @Test
    public void test_phone() {
        assertEquals(7777777, person.getPhone());
    }

    @Test
    public void test_address() {
        assertEquals("Simon Lopez", person.getAddress());
    }

    @Test
    public void test_state() {
        assertEquals("Single", person.getState());
    }

    @Test
    public void test_surname() {
        assertEquals("Vasquez", person.getSurname());
    }

    @Test
    public void test_placeBorn() {
        assertEquals("Oruro", person.getPlaceBorn());
    }

    @Test
    public void test_incorrect_name() {
        assertNotEquals("ketty", person.getName());
    }

    @Test
    public void test_incorrect_age() {
        assertNotEquals(23, person.getAge());
    }

    @Test
    public void test_incorrect_lastName() {
        assertNotEquals("jose", person.getLastName());
    }

    @Test
    public void test_incorrect_address() {
        assertNotEquals("san Martin", person.getAddress());
    }

    @Test
    public void test_incorrect_state() {
        assertNotEquals("married", person.getState());
    }
}
