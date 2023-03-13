package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactDate;


public class ContactCreationTest  extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().initNewContact();
        app.getContactHelper().fillContactForm(new ContactDate("name1", "name2", "name3", "987654", "test@mail.ru"));
        app.getContactHelper().pushEnter();
        app.getNavigationHelper().returnToHomePage();
        app.exit();
    }

}
