package com.devEx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy (id = "#rcc-confirm-button")
    public WebElement iUnderStandBtn;

    @FindBy(name = "email")
    public WebElement inputBoxEmail;

    @FindBy(name = "password")
    public WebElement inputBoxPassword;

    @FindBy(id = "loginpage-form-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement warningMessage;

    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Forgot your password?']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[text()='Developers']")
    public WebElement developersMenu;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginMenu;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerLink;






    public void login(String username, String password){
        iUnderStandBtn.click();
        inputBoxEmail.sendKeys(username);
        inputBoxPassword.sendKeys(password);
        loginButton.click();
    }
}
