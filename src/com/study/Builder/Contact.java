package com.study.Builder;

public class Contact {

    private final String name;
    private final String surname;
    private final String phone;
    private final String mail;
    private final String adress;

    Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.phone = contactBuilder.getPhone();
        this.mail = contactBuilder.getMail();
        this.adress = contactBuilder.getAdress();
    }

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
