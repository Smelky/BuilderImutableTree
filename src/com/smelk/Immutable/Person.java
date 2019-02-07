package com.smelk.Immutable;

public final class Person {

    private final String name;
    private final String surname;

    public Person(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
