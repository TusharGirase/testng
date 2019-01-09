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
 * Page model represents update profile page
 *
 * @author tgirase
 *
 */
public class UpdateProfilePage {
    // TODO: add the xpath here
    @FindBy(xpath = "")
    WebElement aboutMeTextArea;

    private WebDriver driver;

    public UpdateProfilePage(WebDriver driver) {

        this.driver = driver;

        // This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void appendTextToAboutMe(String newText) {
        // TODO: add logic to put the newText to about me textarea
    }

    public void clickSaveButton() {
        // TODO: add logic to click the button
    }
}
