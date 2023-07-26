package com.izaanschool.eventpic;

import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnickEventPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildrenSelectTest extends BaseTest {

@Test
    public void NoChildren(){
        PicnickEventPage cs=new PicnickEventPage(driver,log);
        cs.openPage();
        //select of number children 3 and get the number
       String childrenNo=cs.dropdownchildrenselect(3);
        Assert.assertEquals(childrenNo,"2");



    }

}
