package com.study.Builder;

public class Main {

    public static void main(String[] args) {
        final Contact contact = new ContactBuilder()
                .name("Vova")
                .surname("buba")
                .phone("78546")
                .mail("ss@com")
                .adress("oli")
                .build();

    }
}
