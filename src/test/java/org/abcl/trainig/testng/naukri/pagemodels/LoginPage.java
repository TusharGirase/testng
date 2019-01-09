/* bcabcl
 *
 * Copyright (c) 2019 ABCL, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of ABCL
 * and is subject to the terms of a software license agreement.
 * You shall not disclose such confidential information and shall use it
 * only in accordance with the terms of the license agreement.
 *
 * ecabcl
 */
package org.abcl.trainig.testng.naukri.pagemodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page model represents login page
 *
 * @author tgirase
 */
public class LoginPage {

    // TODO: add the xpath here
    @FindBy(xpath = "")
    WebElement usernameTextbox;

    // TODO: add the xpath here
    @FindBy(xpath = "")
    WebElement passwordTextbox;

    // TODO: add the xpath here
    @FindBy(xpath = "")
    WebElement loginButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        // This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void login(String userName, String password) {
        // TODO Perform Login logic here
    }

}
