package ru.stqa.pft.addressbook;

import org.testng.annotations.*;



public class ContactCreationTest  extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
        initNewContact();
        fillContactForm(new ContactDate("name1", "name2", "name3", "987654", "test@mail.ru"));
        pushEnter();
        returnToHomePage();
        exit();
    }

}
