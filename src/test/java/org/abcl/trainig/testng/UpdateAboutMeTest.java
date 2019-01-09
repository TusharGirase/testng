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
package org.abcl.trainig.testng;

import org.abcl.trainig.testng.naukri.pagemodels.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This class tests that user can update his profile information by logging in to the website
 *
 * @author tgirase
 */
public class UpdateAboutMeTest {
    // TODO: Initialize webdriver
    private static WebDriver webDriver;

    @BeforeClass
    public static void loginUser() {
        // TODO: add logic to login user
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("", "");
    }

    @AfterClass
    public static void logoutUser() {
        // TODO: add fake logic to logout user as this functionality is not working
    }

    /**
     * Tests that user can update about me section and save them
     */
    @Test
    public void test_updateAboutMeTextFromUpdateProfile() {

    }

    /**
     * Tests that user can update education details and save them
     */
    @Test
    public void test_updateEducationDetailsFromUpdateProfile() {

    }

}
