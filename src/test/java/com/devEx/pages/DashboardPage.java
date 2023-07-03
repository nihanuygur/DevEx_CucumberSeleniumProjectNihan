package com.devEx.pages;

import com.devEx.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(css = "#dashboard-p1")
    public WebElement welcomeMessage;


    @FindBy(linkText = "All Posts")
    public WebElement allPosts;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(linkText = "My Posts")
    public WebElement myPost;

    public void navigateMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }

    public void navigateSubMenu(String menuName){
        Driver.get().findElement(By.xpath("//span[text()='"+menuName+"']")).click();
    }
}
