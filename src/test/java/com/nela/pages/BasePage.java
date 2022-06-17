package com.nela.pages;

import com.nela.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="(//a[.='Book My Demo!'])[2]" )
    public WebElement bookMyDemo;

    @FindBy(xpath ="(//div[@class='mega-search-wrap'])[2]" )
    public WebElement searchIcon;


    @FindBy(xpath ="(//input[@type='text'])[2]" )
    public WebElement searchBar;




}
