package com.study;


import com.study.Builder.Contact;
import com.study.Builder.ContactBuilder;

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
