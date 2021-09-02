package com.saucelabs.yy.Tests.Appium.Devices.Apple;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class DeviceTests extends TestBase {

    /**
     * Run the test twice to increase chance to also hit the same device model but different device
     */
    @Test(dataProvider = "RDCDataProvider")
    public void checkForSignedInAppleID(String platform, String deviceName, String platformVersion, Method methodName) throws MalformedURLException {
        createDriver(platform, deviceName, platformVersion, methodName.getName());

        driver.get().activateApp("com.apple.Preferences");
        //String result = ocr.get().getText(driver.get().getScreenshotAs(OutputType.FILE)).toLowerCase(Locale.ROOT);

        //Assert.assertTrue(result.contains("sign in to") || result.contains("testobject"), deviceName + System.lineSeparator() + result);
    }
}
