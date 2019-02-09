package com.smelk.Builder;

public class Contact {

    private String name;
    private String surname;
    private String phone;
    private String mail;
    private String adress;

    protected Contact(ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.phone = contactBuilder.getPhone();
        this.mail = contactBuilder.getMail();
        this.adress = contactBuilder.getAdress();
    }

}
