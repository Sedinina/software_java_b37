package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactDate;
import ru.stqa.pft.addressbook.model.GroupDate;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactDate contactDate, boolean creation) {
        type("firstname", contactDate.getName());
        type("middlename", contactDate.getMiddle());
        type("lastname", contactDate.getSoname());
        type("home", contactDate.getPhone());
        type("email", contactDate.getMail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactDate.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
                  }
        }


    public void initNewContact() {
        click(By.linkText("add new"));
    }

    public void pushEnter() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void selectContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td/input"));
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//input[@value='Delete']"));
        alert();
    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[22]"));
    }

    public void createContact(ContactDate contact, boolean creation) {
     initNewContact();
        fillContactForm(contact, creation);
        pushEnter();
    }

    public boolean isThereAContant() {
        return isElementPresent(By.xpath("//tr[4]/td/input"));
    }



}

