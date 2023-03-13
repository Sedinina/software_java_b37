package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactDate contactDate) {
        type("firstname", contactDate.getName());
        type("middlename", contactDate.getMiddle());
        type("lastname", contactDate.getSoname());
        type("home", contactDate.getPhone());
        type("email", contactDate.getMail());
    }

    public void initNewContact() {
        click(By.linkText("add new"));
    }

    public void pushEnter() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void selectContact() {
        click(By.id("2"));
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//input[@value='Delete']"));
        alert();
    }
}
