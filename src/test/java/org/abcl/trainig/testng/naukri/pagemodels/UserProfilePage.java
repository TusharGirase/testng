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
 * Page model represents user profile page
 *
 * @author tgirase
 */
public class UserProfilePage {

    // TODO: add the xpath here
    @FindBy(xpath = "")
    WebElement updateProfileButton;

    private WebDriver driver;

    public UserProfilePage(WebDriver driver) {

        this.driver = driver;

        // This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void clickUpdateProfileButton() {
        // TODO: add logic to click the button
    }
}
