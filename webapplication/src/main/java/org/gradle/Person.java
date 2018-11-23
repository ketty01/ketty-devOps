package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private final String LastName;
    private final String ci;
    private final int phone;
    private final int age;
    private final String address;
    private final String state;
    private final String surname;
    private final String placeBorn;

    public Person(String name, String lastName, String ci, int phone, int age, String address, String state, String surname, String placeBorn) {
        this.name = name;
        this.LastName = lastName;
        this.ci = ci;
        this.phone = phone;
        this.age = age;
        this.address = address;
        this.state = state;
        this.surname = surname;
        this.placeBorn = placeBorn;
        new GrowthList();
    }

    public String getName() {

        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getCi() {
        return ci;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlaceBorn() {
        return placeBorn;
    }
}
