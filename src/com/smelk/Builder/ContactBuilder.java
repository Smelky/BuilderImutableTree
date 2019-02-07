package com.smelk.Builder;

public class ContactBuilder {

    private String name;
    private String surname;
    private String phone;
    private String mail;
    private String adress;

    public ContactBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder surname(final String surname) {
        this.surname = surname;
        return this;
    }

    public ContactBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public ContactBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }

    public ContactBuilder adress(final String adress) {
        this.adress = adress;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getAdress() {
        return adress;
    }

    public Contact build() {
        return new Contact(this);
    }
}
