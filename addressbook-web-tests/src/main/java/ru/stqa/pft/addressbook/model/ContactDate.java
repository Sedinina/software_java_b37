package ru.stqa.pft.addressbook.model;

public class ContactDate {
    private final String name;
    private final String middle;
    private final String soname;
    private final String phone;
    private final String mail;
    private String group;

    public ContactDate(String Name, String Middle, String Soname, String Phone, String mail, String group) {
        this.name = Name;
        this.middle = Middle;
        this.soname = Soname;
        this.phone = Phone;
        this.mail = mail;
        this.group = group;

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

    public String getGroup()
    {
        return group;
    }
}
