package com.izaanschool.eventpic;

import com.izaanschool.base.BaseTest;
import com.izaanschool.page.PicnickEventPage;
import org.testng.annotations.Test;

public class PicnickEventTest extends BaseTest {

    @Test
    public void picnickTest(){
        //classname     //object               //constarctar
        PicnickEventPage picnickEventPage=new PicnickEventPage(driver,log); //
        picnickEventPage.openPage();//open page call
        picnickEventPage.eventRegistration("sharmin","sharmin@gmail.com","12367890");


    }


}




