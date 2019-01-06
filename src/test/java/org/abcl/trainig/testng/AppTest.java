package org.abcl.trainig.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static final Logger logger = Logger.getLogger(AppTest.class);

    @Test
    public void test() {
        logger.info("Hello World !");
    }
}
