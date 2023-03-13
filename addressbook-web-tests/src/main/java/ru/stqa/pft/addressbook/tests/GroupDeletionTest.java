package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;


public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion()  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    app.exit();
  }


}
