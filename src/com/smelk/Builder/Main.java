package com.smelk.Builder;

public class Main {

    public static void main(String[] args) {

        Contact contact = new ContactBuilder()
                .name("Vasia")
                .surname("Pupkin")
                .phone("0847473")
                .mail("HH@com")
                .adress("posrt").build();
    }
}
