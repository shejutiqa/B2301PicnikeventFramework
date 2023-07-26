package com.izaanschool.eventpic;

import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnickEventPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownPageTest extends BaseTest {
    

    @Test
    public void DropDowntest(){
      //create a picnic event page object
        PicnickEventPage picnickEventPage=new PicnickEventPage(driver,log);
        picnickEventPage.openPage();



//select no of adult using index no.4 and get the text
       String actualAdultNumber=picnickEventPage.dropdownAdultSelect(4);
        //Assert.assertEquals(actualAdultNumber,"4");
        Assert.assertEquals(actualAdultNumber,"4");


    }
}

