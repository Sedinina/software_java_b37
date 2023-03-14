package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactDeletionTest extends TestBase{

    @Test

    public void testContactDeletion(){
        if (!app.getContactHelper().isThereAContant()) {
            app.getContactHelper().createContact(new ContactDate("name1", "name2", "name3", "987654", "test@mail.ru", "test1"), true);
        }
        app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.exit();
    }
}
