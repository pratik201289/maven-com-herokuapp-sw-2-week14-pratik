package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordFiled = By.name("password");
    By loginButton =By.xpath("//button[@type = 'submit']");
    By loginSuccessfulMessage =By.xpath("//div[@class = 'example']/h2[contains(text(), 'Secure Area')]");

    By userNameErrorMessage= By.xpath("//div[@class='flash error']");

    By passwordErrorMessage= By.xpath("//div/div[@id='flash']");
    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password) {
        sendTextToElement(passwordFiled,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getLoginSuccessMessage(){

        return getTextFromElement(loginSuccessfulMessage);
    }
    public String getUserNameErrorMessage(){

       return getTextFromElement(userNameErrorMessage);

    }
    public String getPasswordErrorMessage(){
        return getTextFromElement(passwordErrorMessage);

    }


}
