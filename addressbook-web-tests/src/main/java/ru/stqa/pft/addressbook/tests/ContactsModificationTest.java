package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactsModificationTest extends TestBase{


    @Test

    public void testContactsModification(){
        if (!app.getContactHelper().isThereAContant()) {
            app.getContactHelper().createContact(new ContactDate("name1", "name2", "name3", "987654", "test@mail.ru", "test1"), true);
        }
        app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactDate(null, "name2", "name3", "987654", "test@mail.ru", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToHomePage();
        app.exit();

    }
}
