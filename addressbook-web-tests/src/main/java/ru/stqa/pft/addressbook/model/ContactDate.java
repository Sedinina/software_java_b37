package ru.stqa.pft.addressbook.model;

public class ContactDate {
    private final String name;
    private final String middle;
    private final String soname;
    private final String phone;
    private final String mail;

    public ContactDate(String Name, String Middle, String Soname, String Phone, String mail) {
        name = Name;
        middle = Middle;
        soname = Soname;
        phone = Phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getMiddle() {
        return middle;
    }

    public String getSoname() {
        return soname;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }
}
