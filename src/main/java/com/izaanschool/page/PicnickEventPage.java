package com.izaanschool.page;

import com.google.common.io.PatternFilenameFilter;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PicnickEventPage  extends BasePageObject {
    //page url
    private String pageUrl = "https://develop.d2thmk3us0b2mb.amplifyapp.com";

    //locator
    private By nameBoxLocator = By.id("name");

    private By emailBoxLocator = By.id("email");
    private By phoneNumberBoxLocator = By.id("phone");
    private By noOfAdultBoxLocator = By.id("adults");
    private By noOfChildrenBoxLocator = By.id("children");
    private By submitButtonLocator = By.xpath("//*[@id=\"registration-form\"]/input[4]");


    public PicnickEventPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("page opened");
    }

    public void eventRegistration(String name, String email, String phoneNumber) {
         log.info("Executing submit with name [" + name + "] and email [" + email + "] and phone numer [" + phoneNumber + "]");
       // log.info("name", "email", "phoneNumber"); both are work
        type(name, nameBoxLocator);
        type(email, emailBoxLocator);
        type(phoneNumber, phoneNumberBoxLocator);
    }

//    public String dropdownAdultSelect(int x) {
//        //Declare the drop-down element as an instance of the Select class.
    //      Select dropdownAdult = new Select(find(noOfAdultBoxLocator));
//        // choose 2
//        dropdownAdult.selectByIndex(x);
//        String noOfAdult= dropdownAdult.getFirstSelectedOption().getText();
//        log.info(noOfAdult+ " is selected");
//        return noOfAdult;
//
//    }
    public String dropdownAdultSelect(int x) {
        Select dropdownAdult = new Select(find(noOfAdultBoxLocator));
        dropdownAdult.selectByIndex(x);
        String noOfAudlt = dropdownAdult.getFirstSelectedOption().getText();
        log.info(noOfAudlt);
        return noOfAudlt;
    }
    public String dropdownchildrenselect(int y){
        Select children=new Select(find(noOfChildrenBoxLocator));
        children.selectByIndex(y);
         String noofchildren= children.getFirstSelectedOption().getText();
         log.info(noofchildren);
         return noofchildren;
    }

    public void submit () {
            click(submitButtonLocator);
        }

        public void pressAlertOkButton () {
            switchToAlert().accept();


        }


    }
